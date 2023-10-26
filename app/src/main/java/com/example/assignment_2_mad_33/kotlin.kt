package com.example.assignment_2_mad_33

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        var home: FloatingActionButton =findViewById(R.id.home);
        var w_kotlin: ExtendedFloatingActionButton =findViewById(R.id.w_kotlin);
        var v_kotlin: FloatingActionButton =findViewById(R.id.v_kotlin);
        w_kotlin.setOnClickListener(){
            Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlinlang.org/docs/getting-started.html")).also {
                startActivity(it) }
        }
        home.setOnClickListener(){
            Intent(this,MainActivity::class.java).also { startActivity(it) };
        }
        v_kotlin.setOnClickListener(){
            var intent=Intent(this,video::class.java);
            intent.putExtra("value_kotlin","kotlin");
            startActivity(intent)
        }
    }
}