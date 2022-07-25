package com.example.quizapp

import java.util.*
import kotlin.collections.ArrayList

object setData {

    var name:String = "Name"
    const val scr:String="score"

    fun getques():ArrayList<questions>{
        var ques:ArrayList<questions> = arrayListOf()
        var q1=questions(
            "What is the capital of Israel?",
            "Dhaka",
            "Istanbul",
            "Jerusalem",
            "Jerusalem",
            1
        )
        var q2=questions(
            "What is the capital of USA",
            "New York",
            "Washington DC",
            "Hawkins",
            "Washington DC",
            2
        )

        var q3=questions(
            "What is the capital of United Kingdom",
            "London",
            "Manchester",
            "Oxford",
            "London",
            3
        )

        var q4=questions(
            "What is the capital of Ukraine",
            "Poltava",
            "Kyiv",
            "Moscow",
            "Kyiv",
            4
        )

        var q5=questions(
            "What is the capital of Iraq",
            "Baghdad",
            "Kabul",
            "Quetta",
            "Baghdad",
            5
        )

        var q6=questions(
            "What is the capital of South Korea",
            "Nairobi",
            "Seoul",
            "Bamako",
            "Seoul",
            5
        )

        var q7=questions(
            "What is the capital of Pakistan",
            "Islamabad",
            "Karachi",
            "Lahore",
            "Islamabad",
            5
        )

        var q8=questions(
            "What is the capital of Belarus",
            "Dhaka",
            "Minsk",
            "Havana",
            "Minsk",
            8
            )
        var q9=questions(
            "What is the capital of Egypt",
            "Cairo",
            "Bogota",
            "Maria",
            "Cairo",
            9
        )

        var q10=questions(
"What is the capital of Canada",
            "Ottawa",
        "San Jose",
    "Bogota",
   "Ottawa",
        5)

       var q11=questions(
        "What is the capital of Kazakhstan",
        "Tarawa Atoll",
            "Nur-Sultan",
            "Bishkek",
            "Nur-Sultan",
            5
        )

        var q12=questions(
            "what is the capital of Saudi Arabia",
            "Doha",
            "Riyadh",
            "Abu Dhabi",
            "Riyadh",
            5
        )

        var q13=questions(
            "what is the capital of Syria",
            "Tashkent",
            "Kampala",
            "Damascus",
            "Damascus",
            5
        )

        var q14=questions(
            "what is the capital of Uzbekistan",
            "Tashkent",
            "Damascus",
            "Ashgabat",
            "Tashkent",
            5
        )


        ques.add(q1)
        ques.add(q2)
        ques.add(q3)
        ques.add(q4)
        ques.add(q5)
        ques.add(q6)
        ques.add(q7)
        ques.add(q8)
        ques.add(q9)
        ques.add(q10)
        ques.add(q11)
        ques.add(q12)
        ques.add(q13)
        ques.add(q14)
        ques.shuffle()
        return ques
    }
}

object setData2{
    var name:String = "Name"
    const val scr:String="score"

    fun getques():ArrayList<questions> {
        var ques: ArrayList<questions> = arrayListOf()
        var q1 = questions(
            "What is the Classical Dance of Tamil Nadu?",
            "Kathak",
            "Bharatanatyam",
            "Kathakali",
            "Bharatanatyam",
            1
        )
var q2 = questions(
    " Which Indian State Speaks the Konkani Language?",
    "Goa",
    "Manipur",
    "Nagaland",
    "Goa",
    7
)
        var q3 = questions(
            "Who was the Composer of Vande Mataram?",
            "Rabindranath Tagore",
            "Bankim Chandra Chatterjee",
            "CV Mathur",
            "Bankim Chandra Chatterjee",
            7
        )

        var q4 = questions(
            "Which of the following is the capital of Arunachal Pradesh?",
            "Dispur",
            "Itanagar",
            "Imphal",
            "Itanagar",
            7
        )

        var q5 = questions(
            "Which of the following states is not located in the North?",
            "Himachal Pradesh",
            "Uttar Pradesh",
            "Jharkhand",
            "Jharkhand",
            7
        )

        var q6 = questions(
            "Where is India's First nuclear centre?",
            "Tarapur",
            "Kanpur",
            "Raipur",
            "Tarapur",
            7
        )

        var q7 = questions(
            "Name of the first Aircraft Carrier Indian Ship?",
            "Sukhoi",
            "I.N.S. Vikrant",
            "Brahmos",
            "I.N.S. Vikrant",
            7
        )

        var q8 = questions(
            "Name of the first Indian President to Die in office?",
            "Rajendra Prasad",
            "Dr. Zakir Hussain",
            "Pranav Mukharji",
            "Dr. Zakir Hussain",
            7
        )

        ques.add(q1)
        ques.add(q2)
        ques.add(q3)
        ques.add(q4)
        ques.add(q5)
        ques.add(q6)
        ques.add(q7)
        ques.add(q8)
        ques.shuffle()
        return ques
    }
}