package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnstart: Button = findViewById(R.id.buttonstart)
        btnstart.setOnClickListener{

            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

        val btnpasswordfailed: Button = findViewById(R.id.buttonpasswordfailed)
        btnpasswordfailed.setOnClickListener{

            val intent: Intent = Intent(this, reset_password:: class.java)
            startActivity(intent)
        }
    }
}