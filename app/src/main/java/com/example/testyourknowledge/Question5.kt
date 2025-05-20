package com.example.testyourknowledge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question5)

        val questionTextView = findViewById<TextView>(R.id.textView10)
        val buttonTrue = findViewById<Button>(R.id.button_true5)
        val buttonFalse = findViewById<Button>(R.id.button_false5)
        val buttonNext = findViewById<Button>(R.id.button_next5)

        questionTextView.text = "The D-Day invasion took place on the beaches of Normandy, France"
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
                    val intent = Intent(this, Score::class.java)
                    intent.putExtra("score", score)
                    startActivity(intent)
                    finish()
                }
            }
        }



