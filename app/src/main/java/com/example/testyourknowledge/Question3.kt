package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question3)

        val questionTextView = findViewById<TextView>(R.id.textView6)
        val buttonTrue = findViewById<Button>(R.id.button_true3)
        val buttonFalse = findViewById<Button>(R.id.button_false3)
        val buttonNext = findViewById<Button>(R.id.button_next3)

        questionTextView.text = "Japan was part of the Allied Powers during World War II"
        var score = intent.getIntExtra("score", 0)

        buttonTrue.setOnClickListener {
            Toast.makeText(this, "Incorrect! ", Toast.LENGTH_SHORT).show()
            score++
        }

        buttonFalse.setOnClickListener {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, Question4::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}

