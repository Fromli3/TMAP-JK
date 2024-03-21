package com.example.tmap_04_hw

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class ShowInfoActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_data)
        val infoTxt = intent .getStringExtra("infoTxt")
        val textShow = findViewById<TextView>(R.id.textView)
        textShow.text = infoTxt
        Log.i("info", "Created showInfo activity.")
    }

}
