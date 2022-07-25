package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main1.*
import android.content.Intent

class MainActivity1 : AppCompatActivity(){
    companion object{
        var priname =""
    }
    public var vcc =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        supportActionBar?.hide()

        vcc=intent.getStringExtra(priname).toString()
        namedata.text=vcc
        rycAdapter.Namo=vcc







        val recyclerview = findViewById<RecyclerView>(R.id.recyy)
        recyy.layoutManager = LinearLayoutManager(this)
        val catoData = arrayListOf<cato>(
            cato("World", "This section contains questions related to World", R.drawable.globe),
            cato("India", "In this section, the questions are related to India", R.drawable.ind),

            )
        val adapter = rycAdapter(catoData)
        recyclerview.adapter = adapter
        recyy.setHasFixedSize(true)
        recyclerview.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))





    }



}

