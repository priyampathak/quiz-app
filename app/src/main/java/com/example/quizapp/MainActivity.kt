package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun next(view: View) {
        if(ed.text.isEmpty()){
            Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this, MainActivity1::class.java)
            // start your next activity
            intent.putExtra(MainActivity1.priname,ed.text.toString())
            startActivity(intent)
        }
        intent.putExtra(setData.name, ed.text.toString())


    }
}