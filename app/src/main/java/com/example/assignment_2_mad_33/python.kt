package com.example.assignment_2_mad_33

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class python : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_python)
        var w_python: ExtendedFloatingActionButton =findViewById(R.id.w_python);
        var home:FloatingActionButton=findViewById(R.id.home)
        var v_python: FloatingActionButton =findViewById(R.id.v_python);
        w_python.setOnClickListener(){
            Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.python.org/3/tutorial/index.html")).also {
                startActivity(it) }
        }
        home.setOnClickListener(){
            Intent(this,MainActivity::class.java).also { startActivity(it) };
        }
        v_python.setOnClickListener(){
            var intent=Intent(this,video::class.java);
            intent.putExtra("value_python","python");
            startActivity(intent)
        }
    }
}