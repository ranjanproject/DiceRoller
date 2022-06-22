package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

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
//            Toast.makeText(this, "Amount can not be  grater than invoice", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            showRolledNumber()
        }
    }

    private fun showRolledNumber(){

        setDiceImage(getRandomNumber())
    }

    private fun getRandomNumber(): Int{
        return (1..6).random()
    }

    private fun setDiceImage(num: Int){
        when(num){
            1 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_1)
            2 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_2)
            3 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_3)
            4 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_4)
            5 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_5)
            6 -> findViewById<ImageView>(R.id.dice_image).setImageResource(R.drawable.dice_6)
        }
    }

}