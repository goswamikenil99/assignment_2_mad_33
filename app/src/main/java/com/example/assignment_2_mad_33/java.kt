package com.example.assignment_2_mad_33

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class java : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java);
        var w_java:ExtendedFloatingActionButton=findViewById(R.id.w_java);
        var home:FloatingActionButton=findViewById(R.id.home)
        var v_java: FloatingActionButton =findViewById(R.id.v_java);
        w_java.setOnClickListener(){
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/java-tutorial")).also {
                startActivity(it) }
        }
        home.setOnClickListener(){
            Intent(this,MainActivity::class.java).also { startActivity(it) };
        }
        v_java.setOnClickListener(){
            var intent=Intent(this,video::class.java);
            intent.putExtra("value_java","java");
            startActivity(intent)
        }
    }
}