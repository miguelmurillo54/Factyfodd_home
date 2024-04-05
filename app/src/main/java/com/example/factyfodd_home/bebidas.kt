package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class bebidas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)

        val btnbebidasatras: ImageButton = findViewById(R.id.imageButtonbebidasatras)
        btnbebidasatras.setOnClickListener{

            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}