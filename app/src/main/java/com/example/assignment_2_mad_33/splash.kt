package com.example.assignment_2_mad_33

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import com.google.android.material.animation.AnimationUtils
import com.google.android.material.card.MaterialCardView

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val animFadeOut=android.view.animation.AnimationUtils.loadAnimation(applicationContext,R.anim.animation);
        val m:MaterialCardView=findViewById(R.id.m);
        m.startAnimation(animFadeOut);
        Handler().postDelayed(
            {
                Intent(this,login::class.java).also { startActivity(it) }
                finish()
            },2500
        )
    }
}