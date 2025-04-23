package com.example.putti_rollthedice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private val TAG = "SecondActivity"
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
        val btnCheck : Button = findViewById(R.id.buttonActivityThird)
        btnCheck.setOnClickListener(View.OnClickListener {
            val toast2 = Toast.makeText(this, "controllo", Toast.LENGTH_LONG)
            toast2.show()

            val mioIntent2 : Intent = Intent(this, ThirdActivity::class.java)
            mioIntent2.putExtra("MESSAGE2", "NUMERO ESTRATTO: $random" )
            mioIntent2.putExtra("RANDOM", random)
            Log.d(TAG, random.toString())
            startActivity(mioIntent2)
        })
    }
}