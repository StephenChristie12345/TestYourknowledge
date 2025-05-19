package com.example.testyourknowledge


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Score : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_score)

        val buttonExit = findViewById< Button>(R.id.button_exit1)
        val buttonRestart = findViewById<Button>(R.id.button_restart1)

        val score = intent.getIntExtra("score", 0)
        val scoreTextView = findViewById<TextView>(R.id.textScore)
        scoreTextView.text = "Your Score is: $score out of 5"

        buttonRestart.setOnClickListener {
            val intent = Intent(this, Question1::class.java)
            intent.putExtra("score", 0)
            startActivity(intent)
            finish()
        }

        buttonExit.setOnClickListener {
            finishAffinity()
        }

    }
}