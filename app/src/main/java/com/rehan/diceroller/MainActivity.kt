package com.rehan.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rehan.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //ViewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnDiceRoller.setOnClickListener(View.OnClickListener {
            rollDice()
        })

    }

    private fun rollDice() {
        val randomNumber = (1..6).random()      //creating an array between 1-6 with random function

        //storing images in variable
        val drawableImage =
            when (randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

        binding.ivDiceRoller.setImageResource(drawableImage)
    }
}