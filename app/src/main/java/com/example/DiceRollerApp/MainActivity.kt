package com.example.DiceRollerApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        //Second dice display
        val result2: TextView = findViewById(R.id.text)
        result2.text = diceRoll2.toString()
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