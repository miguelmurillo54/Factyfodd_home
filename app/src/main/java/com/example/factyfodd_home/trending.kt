package com.example.factyfodd_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class trending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending)

        val btnntrendingatras: ImageButton = findViewById(R.id.imageButtontrendingatras)
        btnntrendingatras.setOnClickListener{

            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
        }
        val btnntrendinguno: ImageButton = findViewById(R.id.imageButtonhuevostomate)
        btnntrendinguno.setOnClickListener{

            val intent: Intent = Intent(this,trendinguno ::class.java)
            startActivity(intent)
        }
    }
}