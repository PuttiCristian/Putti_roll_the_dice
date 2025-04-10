package com.example.putti_rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textView2_second_activity)
        textView.text = msg;

        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("RANDOM", -1)
        when (random) {
            1 -> imageViewSecond.setImageResource(R.drawable.dice_face_1)
            2 -> imageViewSecond.setImageResource(R.drawable.dice_face_2)
            3 -> imageViewSecond.setImageResource(R.drawable.dice_face_3)
            4 -> imageViewSecond.setImageResource(R.drawable.dice_face_4)
            5 -> imageViewSecond.setImageResource(R.drawable.dice_face_5)
            6 -> imageViewSecond.setImageResource(R.drawable.dice_face_6)
            else -> imageViewSecond.setImageResource(R.drawable.dices)
        }
        Log.d("SECOND", "FINITO DISEGNO DADO")
    }
}