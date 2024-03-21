package com.example.tmap_04_hw

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.util.Log
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast


class FormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        Log.i("info", "Created form activity.")
    }

    fun acceptForm(view: View) {
        val nameTextBox = findViewById<EditText>(R.id.personName)
        val dateTextBox = findViewById<EditText>(R.id.personBirthDate)
        val inName=nameTextBox.text.toString()
        val inDate=dateTextBox.text.toString()
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        var checkText = "No"
        if (checkBox.isChecked){
            checkText = "Yes"
        }
        Log.i("info", "Second button clicked.")
        val finalTxt = "Name: $inName\nBirth date: $inDate\nChecked the box: $checkText"

        val intent = Intent(this, ShowInfoActivity::class.java).apply {
            putExtra("infoTxt", finalTxt)
        }
        startActivity (intent)
    }

}