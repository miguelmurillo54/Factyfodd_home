package com.example.factyfodd_home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ImageButtonnewrecipe: ImageButton = findViewById(R.id.imageButtonnewrecipe)
        ImageButtonnewrecipe.setOnClickListener {

            val intent: Intent = Intent(this, NuevasRecetas::class.java)
            startActivity(intent)
        }

        val ImageButtontrending: ImageButton = findViewById(R.id.imageButtontrending)
        ImageButtontrending.setOnClickListener {

            val intent: Intent = Intent(this, trending::class.java)
            startActivity(intent)
        }

        val ImageButtonrice: ImageButton = findViewById(R.id.imageButtonrice)
        ImageButtonrice.setOnClickListener {

            val intent: Intent = Intent(this, Arroz::class.java)
            startActivity(intent)
        }

        val ImageButtonpasta: ImageButton = findViewById(R.id.imageButtonpasta)
        ImageButtonpasta.setOnClickListener {

            val intent: Intent = Intent(this, Pasta::class.java)
            startActivity(intent)
        }

        val ImageButtonvegetables: ImageButton = findViewById(R.id.imageButtonvegetables)
        ImageButtonvegetables.setOnClickListener {

            val intent: Intent = Intent(this, Vegetales::class.java)
            startActivity(intent)
        }

        val ImageButtonsoup: ImageButton = findViewById(R.id.imageButtonsoup)
        ImageButtonsoup.setOnClickListener {

            val intent: Intent = Intent(this, Sopa::class.java)
            startActivity(intent)
        }

        val ImageButtonfish: ImageButton = findViewById(R.id.imageButtonfish)
        ImageButtonfish.setOnClickListener {

            val intent: Intent = Intent(this, pescados::class.java)
            startActivity(intent)
        }

        val ImageButtondrinks: ImageButton = findViewById(R.id.imageButtondrinks)
        ImageButtondrinks.setOnClickListener {

            val intent: Intent = Intent(this, bebidas::class.java)
            startActivity(intent)

        }

        val ImageButtonmeat: ImageButton = findViewById(R.id.imageButtonmeat)
        ImageButtonmeat.setOnClickListener {

            val intent: Intent = Intent(this, carne::class.java)
            startActivity(intent)
        }

        val ImageButtonpizza: ImageButton = findViewById(R.id.imageButtonpizza)
        ImageButtonpizza.setOnClickListener {

            val intent: Intent = Intent(this, pizza::class.java)
            startActivity(intent)
        }

        val ImageButtonsnacks: ImageButton = findViewById(R.id.imageButtonsnacks)
        ImageButtonsnacks.setOnClickListener {

            val intent: Intent = Intent(this, snacks::class.java)
            startActivity(intent)
        }

        val ImageButtonhamburger: ImageButton = findViewById(R.id.imageButtonhamburger)
        ImageButtonhamburger.setOnClickListener {

            val intent: Intent = Intent(this, hamburguesas::class.java)
            startActivity(intent)
        }
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

    }
}