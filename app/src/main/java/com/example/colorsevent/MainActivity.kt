package com.example.colorsevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickRed = findViewById<TextView>(R.id.ClickRed)
        val clickBlue = findViewById<TextView>(R.id.ClickBlue)
        val clickGreen=findViewById<TextView>(R.id.ClickGreen)

        val clickTheButton = findViewById<TextView>(R.id.ClickButton)
        clickRed.setOnClickListener {

            clickTheButton.text = "Red was Clicked"
        }
        clickBlue.setOnClickListener {

            clickTheButton.text = "Blue was Clicked"
        }
        clickGreen.setOnClickListener {
            clickTheButton.text="Green was clicked"
        }


    }
}