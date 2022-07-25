package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    companion object{
        var namess="ppppppppppp"
    }

    private var fscore:String?=null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()

        var fname=intent.getStringExtra(namess)
        fscore=intent.getStringExtra(setData.scr)

        val gname=intent.getStringExtra(namess)


        fn.setText(fname)
        fs.setText("$fscore/7")

    }
}