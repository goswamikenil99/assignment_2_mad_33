package com.example.assignment_2_mad_33

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class database : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_database)
        var home: FloatingActionButton =findViewById(R.id.home)
        var w_database: ExtendedFloatingActionButton =findViewById(R.id.w_database);
        var v_database: FloatingActionButton =findViewById(R.id.v_database);
        w_database.setOnClickListener(){
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/sqlite/")).also {
                startActivity(it) }
        }
        home.setOnClickListener(){
            Intent(this,MainActivity::class.java).also { startActivity(it) };
        }
        v_database.setOnClickListener(){
            var intent=Intent(this,video::class.java);
            intent.putExtra("value_database","database");
            startActivity(intent)
        }
    }
}