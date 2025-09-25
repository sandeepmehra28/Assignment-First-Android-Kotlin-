package com.example.assignment_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class DevelopmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_development)

        val contactUsBtn = findViewById<TextView>(R.id.contactUsBtn)
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