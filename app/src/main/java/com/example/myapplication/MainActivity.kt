package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn: Button = findViewById(R.id.btn)
        val myTxtView: TextView = findViewById(R.id.txtView)

        myBtn.setOnClickListener{
            myTxtView.setText(R.string.btn_clicked)
            myBtn.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_200))
        }
    }
}

