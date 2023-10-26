package com.example.assignment_2_mad_33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);
        var login:Button=findViewById(R.id.login);
        var name:EditText=findViewById(R.id.name)
        var pass:EditText=findViewById(R.id.password)
        login.setOnClickListener(){
            if(name.text.toString()=="kenil" && pass.text.toString()=="kenil"){
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Login SuccessFully")
                builder.setMessage("Continue?")
                builder.setIcon(R.drawable.baseline_done_outline_24)
                builder.setPositiveButton("Yes"){dialogInterface, which ->
                    Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_SHORT).show()
                    Intent(this,MainActivity::class.java).also { startActivity(it) }
                    finish()
                }
                builder.setNeutralButton("Cancel"){dialogInterface , which ->
                    Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_LONG).show()
                }
                builder.setNegativeButton("No"){dialogInterface, which ->
                    Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_LONG).show()
                }
                val alertDialog: AlertDialog = builder.create()
                alertDialog.setCancelable(false)
                alertDialog.show()
            }
            else{
                Toast.makeText(applicationContext,"Sorry No Match Password or Name",Toast.LENGTH_LONG).show()
            }
        }
    }
}