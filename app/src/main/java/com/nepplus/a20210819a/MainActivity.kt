package com.nepplus.a20210819a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        toastBtn.setOnClickListener { 
            
            val inputMessage = messageEdt.text.toString()

            Toast.makeText(this, "inputMessage", Toast.LENGTH_SHORT).show()
        }
    }
}