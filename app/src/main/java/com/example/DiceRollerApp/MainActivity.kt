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

        //hooks
        val rollButton: Button = findViewById(R.id.button)

// when the button is clicked
        rollButton.setOnClickListener {
            rollDice()
            val toast = Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT)
            toast.show()
        }
   
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)

        resultTextView.text =diceRoll.toString()
    }
}


// Adding the dice roller logic code
class Dice(private val numSides: Int){
    fun roll() : Int{
        return (1..numSides).random()
    }
}