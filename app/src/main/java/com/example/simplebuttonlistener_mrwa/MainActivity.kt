package com.example.simplebuttonlistener_mrwa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var kotlinButton:Button
    lateinit var xmlButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinButton = findViewById(R.id.kotlinButton)
        xmlButton = findViewById(R.id.XmlButton)


        kotlinButton.setOnClickListener {
         Toast.makeText(this , "Kotlin button was clicked" , Toast.LENGTH_LONG).show()

        }


        xmlButton.setOnClickListener {

            Toast.makeText(this, "Xml Button was clicked",Toast.LENGTH_LONG).show()
        }


    }
}