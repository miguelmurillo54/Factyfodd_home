package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class trending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending)

        val btntrendingatras: ImageButton = findViewById(R.id.imageButtontrendingatras)
        btntrendingatras.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btntrendinguno: ImageButton = findViewById(R.id.imageButtonhuevostomate)
        btntrendinguno.setOnClickListener {

            val intent: Intent = Intent(this, trendinguno::class.java)
            startActivity(intent)
        }
        val btntrendingdos: ImageButton = findViewById(R.id.imageButtoncookies)
        btntrendingdos.setOnClickListener {

            val intent: Intent = Intent(this, trendingdos::class.java)
            startActivity(intent)
        }
        val btntrendingtres: ImageButton = findViewById(R.id.imageButtonpastalangostinos)
        btntrendingtres.setOnClickListener {

            val intent: Intent = Intent(this, trendingtres::class.java)
            startActivity(intent)
        }

        val btntrendingcuatro: ImageButton = findViewById(R.id.imageButtonsaladbrocolipollo)
        btntrendingcuatro.setOnClickListener {

            val intent: Intent = Intent(this, trendingcuatro::class.java)
            startActivity(intent)
        }

        val btntrendingcinco: ImageButton = findViewById(R.id.imageButtonavena)
        btntrendingcinco.setOnClickListener {

            val intent: Intent = Intent(this, trendingcinco::class.java)
            startActivity(intent)
        }

        val btntrendingseis: ImageButton = findViewById(R.id.imageButtonarroz_champiñones)
        btntrendingseis.setOnClickListener {

            val intent: Intent = Intent(this, trendingseis::class.java)
            startActivity(intent)
        }
    }
}