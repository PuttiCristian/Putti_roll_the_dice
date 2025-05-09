package com.example.putti_rollthedice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val btnRoll : Button = findViewById(R.id.ButtonRoll)
        btnRoll.setOnClickListener(View.OnClickListener {
            val toast = Toast.makeText(this, "lancio del dado", Toast.LENGTH_LONG)
            toast.show()

            val mioIntent : Intent = Intent(this, SecondActivity::class.java)
            val mioRandom = (1..6).random()
            mioIntent.putExtra("MESSAGE", "NUMERO ESTRATTO: $mioRandom" )
            mioIntent.putExtra("RANDOM", mioRandom )
            startActivity(mioIntent)
        })
        }
    }