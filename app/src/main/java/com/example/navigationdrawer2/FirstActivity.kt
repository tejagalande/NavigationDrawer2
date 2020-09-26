package com.example.navigationdrawer2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var btn = findViewById<Button>(R.id.btn_next)

        btn.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
            Toast.makeText(this,"Next Activity",Toast.LENGTH_SHORT).show()
        }
    }


}