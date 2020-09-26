package com.example.navigationdrawer2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btn = findViewById<Button>(R.id.btn_send)

        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}