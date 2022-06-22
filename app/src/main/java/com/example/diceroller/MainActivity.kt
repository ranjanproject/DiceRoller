package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        initializeButton()
    }

    private fun initializeButton(){
        val btn = findViewById<Button>(R.id.roll_btn)

        btn.setOnClickListener {
            showRolledNumber()
        }
    }

    private fun showRolledNumber(){
        val num = getRandomNumber()
        findViewById<TextView>(R.id.num_text).text = num.toString()
    }

    private fun getRandomNumber(): Int{
        return (1..6).random()
    }

}