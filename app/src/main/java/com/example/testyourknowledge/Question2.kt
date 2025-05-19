package com.example.testyourknowledge


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question2)

        val questionTextView = findViewById<TextView>(R.id.textView3)
        val buttonTrue = findViewById<Button>(R.id.button_true2)
        val buttonFalse = findViewById<Button>(R.id.button_false2)
        val buttonNext = findViewById<Button>(R.id.button_next2)

        questionTextView.text = "The Atomic Bomb was first dropped on the German City of Berlin"
        var score = intent.getIntExtra("score", 0)

        buttonTrue.setOnClickListener {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
            score++
        }

        buttonFalse.setOnClickListener {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, Question3::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}




