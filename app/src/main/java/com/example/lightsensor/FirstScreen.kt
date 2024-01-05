package com.example.lightsensor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
       Handler(Looper.getMainLooper()).postDelayed({
        val i=Intent(this,MainActivity::class.java)
        startActivity(i)
           finish()
       },3000)
    }
}