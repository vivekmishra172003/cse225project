package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginscreen)
        val btn = findViewById<Button>(R.id.login_button)
        btn.setOnClickListener{
            intent = Intent(applicationContext,csewallah::class.java)
            startActivity(intent)
        }
    }
}