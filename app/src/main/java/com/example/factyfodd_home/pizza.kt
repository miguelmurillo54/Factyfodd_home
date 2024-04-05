package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class pizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        val btnpizzaatras: ImageButton = findViewById(R.id.imageButtonpizzaatras)
        btnpizzaatras.setOnClickListener{

            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}