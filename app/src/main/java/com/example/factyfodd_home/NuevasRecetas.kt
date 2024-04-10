package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class NuevasRecetas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevas_recetas)

        val btnnewrecipeatras: ImageButton= findViewById(R.id.imageButtonnewrecipeatras)
        btnnewrecipeatras.setOnClickListener{

            val intent: Intent=Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        val btnnewrecipeuno: ImageButton= findViewById(R.id.imageButtonpanqueques)
        btnnewrecipeuno.setOnClickListener{

            val intent: Intent=Intent(this,newrecipeuno ::class.java)
            startActivity(intent)
        }
    }

}