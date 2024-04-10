package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class comunidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comunidad)

        val btnhome: ImageButton = findViewById(R.id.imageButtonhome)
        btnhome.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnnews: ImageButton = findViewById(R.id.imageButtonnews)
        btnnews.setOnClickListener{

            val intent: Intent = Intent(this, news::class.java)
            startActivity(intent)//
        }
        val btncomunity: ImageButton = findViewById(R.id.imageButtoncomunity)
        btncomunity.setOnClickListener{

            val intent: Intent = Intent(this, comunidad::class.java)
            startActivity(intent)
        }
        val btnprofile: ImageButton = findViewById(R.id.imageButtonprofile)
        btnprofile.setOnClickListener{

            val intent: Intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        val btncomuno: ImageButton = findViewById(R.id.imageButtoncomunidaduno)
        btncomuno.setOnClickListener{

            val intent: Intent = Intent(this, comunidaduno ::class.java)
            startActivity(intent)
        }
        val btncomdos: ImageButton = findViewById(R.id.imageButtoncomunidaddos)
        btncomdos.setOnClickListener{

            val intent: Intent = Intent(this, comunidaddos ::class.java)
            startActivity(intent)
        }
    }
}

