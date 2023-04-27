package com.example.memestatus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class finalActivity : AppCompatActivity() {
    lateinit var btnseven:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        btnseven=findViewById(R.id.btnseven)
        btnseven.setOnClickListener {
            val intent=Intent(this,funnyActivity::class.java)
            startActivity(intent)

        }
    }
}

