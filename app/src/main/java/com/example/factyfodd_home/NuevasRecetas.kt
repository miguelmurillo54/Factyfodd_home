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
        val btnnewrecipedos: ImageButton= findViewById(R.id.imageButtontoast)
        btnnewrecipedos.setOnClickListener{

            val intent: Intent=Intent(this,newrecipedos ::class.java)
            startActivity(intent)
        }
        val btnnewrecipetres: ImageButton= findViewById(R.id.imageButtonpasteltaza)
        btnnewrecipetres.setOnClickListener{

            val intent: Intent=Intent(this,newrecipetres ::class.java)
            startActivity(intent)
        }
        val btnnewrecipecuatro: ImageButton= findViewById(R.id.imageButtonpancalabacin)
        btnnewrecipecuatro.setOnClickListener{

            val intent: Intent=Intent(this,newrecipecuatro ::class.java)
            startActivity(intent)
        }
        val btnnewrecipecinco: ImageButton= findViewById(R.id.imageButtonalitas)
        btnnewrecipecinco.setOnClickListener{

            val intent: Intent=Intent(this,newrecipecinco ::class.java)
            startActivity(intent)
        }
        val btnnewrecipeseis: ImageButton= findViewById(R.id.imageButtonalbondigas)
        btnnewrecipeseis.setOnClickListener{

            val intent: Intent=Intent(this,newrecipeseis ::class.java)
            startActivity(intent)
        }

    }

}