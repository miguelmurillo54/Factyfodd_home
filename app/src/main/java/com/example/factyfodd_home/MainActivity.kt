package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnnewrecipe: ImageButton= findViewById(R.id.imageButtonnewrecipe)
        btnnewrecipe.setOnClickListener{

            val intent: Intent=Intent(this, NuevasRecetas:: class.java)
            startActivity(intent)
        }

        val btntrending: ImageButton= findViewById(R.id.imageButtontrending)
        btntrending.setOnClickListener{

            val intent: Intent=Intent(this, trending:: class.java)
            startActivity(intent)
        }

        val btnrice: ImageButton= findViewById(R.id.imageButtonrice)
        btnrice.setOnClickListener{

            val intent: Intent=Intent(this, Arroz::class.java)
            startActivity(intent)
        }
        val btnpasta: ImageButton= findViewById(R.id.imageButtonpasta)
        btnpasta.setOnClickListener{

            val intent: Intent=Intent(this, Pasta::class.java)
            startActivity(intent)
        }

        val btnvegetables: ImageButton= findViewById(R.id.imageButtonvegetables)
        btnvegetables.setOnClickListener{

            val intent: Intent=Intent(this, Vegetales::class.java)
            startActivity(intent)
        }

        val btnsoup: ImageButton= findViewById(R.id.imageButtonsoup)
        btnsoup.setOnClickListener{

            val intent: Intent=Intent(this, Sopa::class.java)
            startActivity(intent)
        }

        val btnfish: ImageButton= findViewById(R.id.imageButtonfish)
        btnfish.setOnClickListener{

            val intent: Intent=Intent(this, pescados::class.java)
            startActivity(intent)
        }

        val btndrinks: ImageButton= findViewById(R.id.imageButtondrinks)
        btndrinks.setOnClickListener{

            val intent: Intent=Intent(this, bebidas::class.java)
            startActivity(intent)
        }

        val btnmeet: ImageButton= findViewById(R.id.imageButtonmeet)
        btnmeet.setOnClickListener{

            val intent: Intent=Intent(this, carne::class.java)
            startActivity(intent)
        }

        val btnpizza: ImageButton= findViewById(R.id.imageButtonpizza)
        btnpizza.setOnClickListener{

            val intent: Intent=Intent(this, pizza::class.java)
            startActivity(intent)
        }

        val btnsnacks: ImageButton= findViewById(R.id.imageButtonsnacks)
        btnsnacks.setOnClickListener{

            val intent: Intent=Intent(this, snacks::class.java)
            startActivity(intent)
        }

        val btnhamburguer: ImageButton= findViewById(R.id.imageButtonhamburger)
        btnhamburguer.setOnClickListener{

            val intent: Intent=Intent(this, hamburguesas::class.java)
            startActivity(intent)
        }
        val btnhome: ImageButton= findViewById(R.id.imageButtonhome)
        btnhome.setOnClickListener{

            val intent: Intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnnews: ImageButton= findViewById(R.id.imageButtonnews)
        btnnews.setOnClickListener{

            val intent: Intent=Intent(this, news::class.java)
            startActivity(intent)//
        }
        val btncomunity: ImageButton= findViewById(R.id.imageButtoncomunity)
        btncomunity.setOnClickListener{

            val intent: Intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnprofile: ImageButton= findViewById(R.id.imageButtonprofile)
        btnprofile.setOnClickListener{

        val intent: Intent=Intent(this, profile::class.java)
        startActivity(intent)
    }
    }
}