package com.example.kt_fileread_write

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.io.File

class MainActivity : AppCompatActivity() {
    private lateinit var btnRead: Button
    private lateinit var btnWrite: Button
    private lateinit var et: EditText
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRead = findViewById(R.id.btnRead)
        btnWrite = findViewById(R.id.btnWrite)
        et = findViewById(R.id.et)
        tv = findViewById(R.id.tv)

        btnRead.setOnClickListener {
            val dataDir = ContextCompat.getDataDir(this)
            val myFile = File(dataDir, "file.txt")
            tv.text = myFile.readText()
        }


        btnWrite.setOnClickListener {
            val dataDir = ContextCompat.getDataDir(this)
            val myFile = File(dataDir, "file.txt")
            myFile.writeText(et.text.toString())
        }


    }
}