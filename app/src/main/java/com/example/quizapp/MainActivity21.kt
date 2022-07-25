package com.example.quizapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import android.content.Intent

class MainActivity21 : AppCompatActivity() {
    companion object{
        var sharabi = ""

    }


    private var cP: Int = 0
    private var count = 0
    private var bthree = 0
    private var btwo = 0
    private var bone = 0
    private var state = 6
    public var score = 0
    public var named = "klklk"
    private var qlist: ArrayList<questions>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()




        named= intent.getStringExtra(setData.name).toString()
        qlist = setData2.getques()
        setQues()


    }

    fun setQues() {


        val sb:String = intent.getStringExtra(sharabi).toString()


        var quess = qlist!![cP]
        t1.text = quess.ques
        b1.text = quess.opt1
        b2.text = quess.opt2
        b3.text = quess.opt3
        cP++

        fun freshbt() {
            b1.setBackgroundColor(Color.parseColor("#E4772B"))
            b2.setBackgroundColor(Color.parseColor("#E4772B"))
            b3.setBackgroundColor(Color.parseColor("#E4772B"))
        }


        fun selopt() {
            b1.setOnClickListener {
                if (btwo == 0 && bthree == 0) {
                    count = 1
                    bone++
                    if (b1.text == quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#4AB516"))
                        b2.setBackgroundColor(Color.parseColor("#E4772B"))
                        b3.setBackgroundColor(Color.parseColor("#E4772B"))
                        score++
                    }
                    if (b1.text != quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#B00000"))
                        b2.setBackgroundColor(Color.parseColor("#E4772B"))
                        b3.setBackgroundColor(Color.parseColor("#E4772B"))
                    }
                }
            }


            b2.setOnClickListener {
                if (bone == 0 && bthree == 0) {
                    count = 1
                    btwo++
                    if (b2.text == quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#E4772B"))
                        b2.setBackgroundColor(Color.parseColor("#4AB516"))
                        b3.setBackgroundColor(Color.parseColor("#E4772B"))
                        score++
                    }
                    if (b2.text != quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#E4772B"))
                        b2.setBackgroundColor(Color.parseColor("#B00000"))
                        b3.setBackgroundColor(Color.parseColor("#E4772B"))
                    }
                }
            }


            b3.setOnClickListener {
                if (btwo == 0 && bone == 0) {
                    count = 1
                    bthree++
                    if (b3.text == quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#E4772B"))
                        b2.setBackgroundColor(Color.parseColor("#E4772B"))
                        b3.setBackgroundColor(Color.parseColor("#4AB516"))
                        score++
                    }
                    if (b3.text != quess.ans) {
                        b1.setBackgroundColor(Color.parseColor("#E4772B"))
                        b2.setBackgroundColor(Color.parseColor("#E4772B"))
                        b3.setBackgroundColor(Color.parseColor("#B00000"))
                    }
                }
            }


            progressBar.max=state+1
            n.setOnClickListener {
                if (cP < state) {
                    setQues()
                    freshbt()
                    progressBar.progress = cP
                }
                else if(cP==state){
                    n.setText("Finish")
                    setQues()
                    freshbt()
                    progressBar.progress=cP
                    n.setBackgroundColor(Color.parseColor("#226099"))
                }

                else{
                    val intent = Intent(this, MainActivity3::class.java)
                    // start your next activity
                    intent.putExtra(MainActivity3.namess,sb)
                    intent.putExtra(setData.scr, score.toString())
                    startActivity(intent)


                }

            }
            bone = 0; btwo = 0; bthree = 0
        }

        selopt()
    }
}
