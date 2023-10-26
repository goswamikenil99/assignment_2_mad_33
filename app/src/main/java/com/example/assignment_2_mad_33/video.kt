package com.example.assignment_2_mad_33

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class video : AppCompatActivity() {
    var media:VideoView? = null
    var media_control:MediaController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        media=findViewById(R.id.videoview)
        if(media_control==null){
            media_control= MediaController(this)
            media_control!!.setAnchorView(this.media)
        }
        if(intent.extras?.getString("value_python")=="python") {
            media!!.setMediaController(media_control)
            media!!.setVideoURI(
                Uri.parse("android.resource://" + packageName + "/" + R.raw.python)
            )
            media!!.requestFocus()
            media!!.start()
        }
        if(intent.extras?.getString("value_java")=="java") {
            media!!.setMediaController(media_control)
            media!!.setVideoURI(
                Uri.parse("android.resource://" + packageName + "/" + R.raw.java)
            )
            media!!.requestFocus()
            media!!.start()
        }
        if(intent.extras?.getString("value_database")=="database") {
            media!!.setMediaController(media_control)
            media!!.setVideoURI(
                Uri.parse("android.resource://" + packageName + "/" + R.raw.sql)
            )
            media!!.requestFocus()
            media!!.start()
        }
        if(intent.extras?.getString("value_kotlin")=="kotlin") {
            media!!.setMediaController(media_control)
            media!!.setVideoURI(
                Uri.parse("android.resource://" + packageName + "/" + R.raw.kotlin)
            )
            media!!.requestFocus()
            media!!.start()
        }
    }
}