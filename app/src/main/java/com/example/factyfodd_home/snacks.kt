package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class snacks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snacks)

        val btnsnaksatras: ImageButton = findViewById(R.id.imageButtonsnaksatras)
        btnsnaksatras.setOnClickListener{

            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}