package com.example.dayone

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Project_Activity : AppCompatActivity() {

    lateinit var TextView: TextView
   lateinit var textPersonName : EditText
   lateinit var EditText : EditText
 lateinit var textEmailAddress : EditText
 lateinit var textPassword : EditText
 lateinit var Button: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project)

        TextView = findViewById(R.id.textView1)
        textPersonName = findViewById(R.id.username)
        EditText = findViewById(R.id.lastname)
        textEmailAddress = findViewById(R.id.email)
        textPassword = findViewById(R.id.password)
        Button = findViewById(R.id.btn_signup)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}