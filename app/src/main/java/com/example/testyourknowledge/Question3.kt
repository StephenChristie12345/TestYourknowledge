package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Question3:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question1)

        val buttonTrue = findViewById<Button>(R.id.True)
        val buttonFalse = findViewById<Button>(R.id.False)
        val buttonNext = findViewById<Button>(R.id.Next)

        buttonTrue.setOnClickListener {
            checkAnswer(true)
        }
        buttonFalse.setOnClickListener {
            checkAnswer(false)
        }
        buttonNext.setOnClickListener {
            showNextQuestion()
        }
    }
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = getCorrectAnswerForCurrentQuestion()

        if (userAnswer == correctAnswer) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Incoorect!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun getCorrectAnswerForCurrentQuestion(): Boolean {
        return true
    }

    private fun showNextQuestion() {
        val intent = Intent(this, Question4::class.java)
        startActivity(intent)
        finish()
    }
}
