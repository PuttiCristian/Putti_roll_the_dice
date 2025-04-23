package com.example.putti_rollthedice

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var msg2 = intent.getStringExtra("MESSAGE2")
        val textView = findViewById<TextView>(R.id.textView1ActivityThird)
        textView.text = msg2;

        var n = intent.getIntExtra("RANDOM", -1)
        var str = ""
        if (n % 2 == 0) {
           str="HAI PERSO"
        } else {
            str="HAI VINTO"
        }
        val textView2 = findViewById<TextView>(R.id.textView2ActivityThird)
        textView2.text = str;
}
}