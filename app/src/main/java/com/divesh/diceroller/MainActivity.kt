package com.divesh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divesh.diceroller.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rollButton.text = "Let's Roll"

            rollButton.setOnClickListener {
                val drawableResource = when(rollDice()){
                    1-> R.drawable.dice_1
                    2-> R.drawable.dice_2
                    3-> R.drawable.dice_3
                    4-> R.drawable.dice_4
                    5-> R.drawable.dice_5

                    else -> R.drawable.dice_1
                }

                diceImage.setImageResource(drawableResource)
            }

        }

    }

    private fun rollDice():Int{
        return Random().nextInt(6) + 1
    }
}