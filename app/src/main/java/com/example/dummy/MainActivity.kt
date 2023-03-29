package com.example.dummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.customlibrary.BasicUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastButton = findViewById<Button>(R.id.toastButton)
        toastButton.setOnClickListener {
            BasicUtils().makeToast(this)
        }
    }
}