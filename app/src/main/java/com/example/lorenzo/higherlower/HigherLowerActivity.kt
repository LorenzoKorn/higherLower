package com.example.lorenzo.higherlower

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_higher_lower.*

class HigherLowerActivity : AppCompatActivity() {

    private var currentThrow: Int = 1
    private var lastThrow: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher_lower)
        initViews()
    }

    private fun initViews() {
        updateUI()
    }

    private fun updateUI() {
        // update last throw
        lastThrowTv.text = getString(R.string.last_throw, lastThrow)

        // update image
        when (currentThrow) {
            1 -> diceImage.setImageResource(R.drawable.dice1)
            2 -> diceImage.setImageResource(R.drawable.dice2)
            3 -> diceImage.setImageResource(R.drawable.dice3)
            4 -> diceImage.setImageResource(R.drawable.dice4)
            5 -> diceImage.setImageResource(R.drawable.dice5)
            6 -> diceImage.setImageResource(R.drawable.dice6)
        }
    }

    private fun roll() {

    }
}
