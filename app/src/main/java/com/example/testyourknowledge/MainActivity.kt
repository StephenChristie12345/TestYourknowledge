package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.Start)

        startButton.setOnClickListener {
            val intent = Intent(this, Question1::class.java)
            startActivity(intent)
            finish()
           }
        }
    }
