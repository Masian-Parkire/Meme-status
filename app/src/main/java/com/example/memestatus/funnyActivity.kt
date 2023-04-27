package com.example.memestatus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class funnyActivity : AppCompatActivity() {
    lateinit var btnthree:Button
    lateinit var btnfour:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_funny)
        btnthree=findViewById(R.id.btnthree)
        btnfour=findViewById(R.id.btnfour)
        btnthree.setOnClickListener {
            val intent=Intent(this,finalActivity::class.java)
            startActivity(intent)
        }
        btnfour.setOnClickListener {
            val intent=Intent(this,googleActivity::class.java)
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