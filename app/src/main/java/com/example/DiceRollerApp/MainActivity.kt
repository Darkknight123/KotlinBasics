package com.example.DiceRollerApp

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

        /**
         * hooks
         */
        val rollButton: Button = findViewById(R.id.button)

        /**
         * when the button is clicked
         */

        rollButton.setOnClickListener {
            rollDice()
            val toast = Toast.makeText(this, " 2 Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
        }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //hooks
        val diceImage: ImageView = findViewById(R.id.diceImage)

        //set the right dice image equal to the generated roll
        diceImage.setImageResource(R.drawable.dice_2)


    }
}


/**
 * Adding the dice roller logic code
 */

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}