package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val welcomeMessage = findViewById<TextView>(R.id.welcome_message)
        val startButton = findViewById<Button>(R.id.Start_button)
        val exitButton = findViewById<Button>(R.id.exit_button)




        welcomeMessage.text = "Attention Soldier!"


        startButton.setOnClickListener {
            val intent = Intent(this, Question1::class.java)
            startActivity(intent)
            finish()
           }

        exitButton.setOnClickListener {
            finish()

           }
        }
    }
