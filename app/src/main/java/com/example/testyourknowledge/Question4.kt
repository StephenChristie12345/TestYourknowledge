package com.example.testyourknowledge

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Question4 : AppCompatActivity() {

    private val question = listOf(
        "World War II began in 1939 when Germany invaded Poland",
        "The atomic bomb was first dropped on the German city of Berlin",
        "Japan was part of the Allied Powers during World War II",
        "Adolf Hitler was the leader of the Nazi Germany during World War II",
        "The D-Day invasion took place on the beaches of Normandy"
    )

    private val answers = listOf( true, false, false, true, true)

    private var currentQuestionIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question4)

        currentQuestionIndex = intent.getIntExtra("question_index", 0)

        val questionTextView7 = findViewById<TextView>(R.id.textView7)
        val questionTextView = findViewById<TextView>(R.id.textView8)
        val buttonTrue = findViewById<Button>(R.id.button_true4)
        val buttonFalse = findViewById<Button>(R.id.button_false4)
        val buttonNext = findViewById<Button>(R.id.button_next4)

        questionTextView.text = question[currentQuestionIndex]

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
        val correctAnswer = answers[currentQuestionIndex]

        if (userAnswer == correctAnswer) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Incoorect!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showNextQuestion() {
        val nextIndex = currentQuestionIndex + 1

        if (nextIndex < question.size) {
            val nextIntent = when (nextIndex) {
                1 -> Intent(this, Question2::class.java)
                2 -> Intent(this, Question3::class.java)
                3 -> Intent(this, Question4::class.java)
                4 -> Intent(this, Question5::class.java)
                else -> Intent(this, Question1::class.java)
            }
            nextIntent.putExtra("question_index", nextIndex)
            startActivity(nextIntent)
            finish()
        } else {
            Toast.makeText(this, "end of quize!", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}





