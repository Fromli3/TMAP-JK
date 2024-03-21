package com.example.tmap_04_hw

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("info", "Created main activity.")
    }

    fun nextActivity(view: View) {
        Log.i("info", "First button clicked.")
        val intent = Intent(this, FormActivity::class.java).apply{}
        startActivity (intent)
    }

}
