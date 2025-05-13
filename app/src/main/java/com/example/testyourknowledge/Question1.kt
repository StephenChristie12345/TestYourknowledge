package com.example.testyourknowledge

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question1)

        val buttonTrue = findViewById<Button>(R.id.True)
        val buttonFalse = findViewById<Button>(R.id.False)

        buttonTrue.setOnClickListener {
            checkAnswer(true)
        }
        buttonFalse.setOnClickListener {
            checkAnswer(false)
        }
    }
}

private fun Question1.checkAnswer(bool: Boolean) {}

}