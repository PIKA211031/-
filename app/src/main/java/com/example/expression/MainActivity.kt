package com.example.expression

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etA = findViewById<EditText>(R.id.etA)
        val etB = findViewById<EditText>(R.id.etB)
        val btCal = findViewById<Button>(R.id.btCal)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btCal.setOnClickListener {
            val a = etA.text.toString().toDouble()
            val b = etB.text.toString().toDouble()
            tvResult.text = (a+b).toString()
        }
    }
}