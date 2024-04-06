package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reset_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val btnrestablecer: Button = findViewById(R.id.buttonrestablecer)
        btnrestablecer.setOnClickListener{

            val intent: Intent = Intent(this, login:: class.java)
            startActivity(intent)
        }
    }
}