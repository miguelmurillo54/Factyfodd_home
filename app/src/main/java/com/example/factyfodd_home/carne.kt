package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class carne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carne)

        val btnmeetatras: ImageButton = findViewById(R.id.imageButtonmeetatras)
        btnmeetatras.setOnClickListener{

            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
    }
}