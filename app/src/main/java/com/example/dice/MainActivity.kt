package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage : ImageView
    private lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_img)
        diceImage2 = findViewById(R.id.dice_img2)

        val diceBtn = findViewById<Button>(R.id.button)

        diceBtn.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){

        val image  = when((1..6).random()){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.ic_launcher_foreground

        }
        val image2  = when((1..6).random()){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.ic_launcher_foreground

        }


        diceImage.setImageResource(image)
        diceImage2.setImageResource(image2)

    }

}