package com.example.assignment_2_mad_33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        var btn_java:MaterialButton=findViewById(R.id.btn_java);
        var btn_python:MaterialButton=findViewById(R.id.btn_python);
        var btn_kotlin:MaterialButton=findViewById(R.id.btn_kotlin);
        var btn_databse:MaterialButton=findViewById(R.id.btn_database);
        btn_java.setOnClickListener(){
            startActivity(Intent(this,java::class.java));
        }
        btn_python.setOnClickListener(){
            startActivity(Intent(this,python::class.java));
        }
        btn_kotlin.setOnClickListener(){
            startActivity(Intent(this,kotlin::class.java));
        }
        btn_databse.setOnClickListener(){
            startActivity(Intent(this,database::class.java));
        }
    }
}