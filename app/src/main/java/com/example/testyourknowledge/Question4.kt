package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question4)

        val questionTextView = findViewById<TextView>(R.id.textView8)
        val buttonTrue = findViewById<Button>(R.id.button_true4)
        val buttonFalse = findViewById<Button>(R.id.button_false4)
        val buttonNext = findViewById<Button>(R.id.button_next4)

        questionTextView.text = "Adolf Hitler was the leader of Nazi Germany during World War II"
        var score = intent.getIntExtra("score", 0)
        var answered = false

        buttonTrue.setOnClickListener {
            if (!answered) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                score++
                answered = true
                buttonTrue.isEnabled = false
                buttonFalse.isEnabled = false
            }
            }

            buttonFalse.setOnClickListener {
                if (!answered) {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
                    answered = true
                    buttonTrue.isEnabled = false
                    buttonFalse.isEnabled = false
                }
                }

                buttonNext.setOnClickListener {
                    val intent = Intent(this, Question5::class.java)
                    intent.putExtra("score", score)
                    startActivity(intent)
                    finish()
                }
            }
        }



