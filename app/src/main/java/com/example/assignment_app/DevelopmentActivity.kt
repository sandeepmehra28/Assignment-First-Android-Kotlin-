package com.example.assignment_app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.net.toUri

class DevelopmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_development)
        val androidDevCV = findViewById<CardView>(R.id.AndroidDevBtn)
        val webDevCV = findViewById<CardView>(R.id.WebDevBtn)
        val iosDevCV = findViewById<CardView>(R.id.IOSDevBtn)
        val mlCV = findViewById<CardView>(R.id.MLBtn)
        val contactUsBtn = findViewById<TextView>(R.id.contactUsBtn)

        androidDevCV.setOnClickListener {
            val intent = Intent(this, AndroidDevActivity::class.java)
            startActivity(intent)
        }
        webDevCV.setOnClickListener {
            val intent = Intent(this, WebDevActivity::class.java)
            startActivity(intent)
        }
        iosDevCV.setOnClickListener {
            val intent = Intent(this, IOSDevActivity::class.java)
            startActivity(intent)
        }
        mlCV.setOnClickListener {
            val intent = Intent(this, MLActivity::class.java)
            startActivity(intent)
        }
        contactUsBtn.setOnClickListener {
            try{
                val number = "9870550873"
                val dialIntent = Intent(Intent.ACTION_DIAL)
                dialIntent.data = "tel:$number".toUri()
                startActivity(dialIntent)
            }catch (e:Exception){
                e.printStackTrace()
            }


        }
    }
}