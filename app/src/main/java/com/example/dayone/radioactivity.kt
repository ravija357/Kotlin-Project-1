package com.example.dayone

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class radioactivity : AppCompatActivity() {
  lateinit var radioPhoto:RadioButton
  lateinit var radioApple:RadioButton
  lateinit var radioRadioButton: RadioButton
  lateinit var radioButton: RadioButton
  lateinit var imageViewRadio : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radioactivity)
        radioPhoto = findViewById(R.id.btnPhoto)
        radioApple = findViewById(R.id.btnApple)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}