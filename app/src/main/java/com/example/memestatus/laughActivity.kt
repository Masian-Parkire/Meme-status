package com.example.memestatus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class laughActivity : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laugh)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button4.setOnClickListener {
            val intent=Intent(this,googleActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}