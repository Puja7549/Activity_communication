package com.example.activitycommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var sendText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.buttonSend)
        sendText = findViewById(R.id.editTextMsg)
        button.setOnClickListener {

            if (!sendText.text.isNullOrBlank()){
                val fragment = BlankFragment()
                val bundle = Bundle()
                bundle.putString("string" ,sendText.text.toString())
                fragment.arguments = bundle
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
                sendText.setText("")
            }

        }

    }



    }










