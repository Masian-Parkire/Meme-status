package com.example.memestatus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class googleActivity : AppCompatActivity() {
    lateinit var btnbuttwo:Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)
        btnbuttwo=findViewById(R.id.btnbuttwo)
        btnbuttwo.setOnClickListener {
            val intent=Intent(this,funnyActivity::class.java)
            startActivity(intent)
        }
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent(this,laughActivity::class.java)
            startActivity(intent)
        }
    }
}

////class MainActivity : AppCompatActivity() {
////    lateinit var btnbutton1:TextView
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////        btnbutton1=findViewById(R.id.btnbutton1)
////        btnbutton1.setOnClickListener {
////            val intent=Intent(this,googleActivity::class.java)
////            startActivity(intent)
////        }
////    }
////}