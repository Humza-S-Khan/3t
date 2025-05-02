package com.example.humzawatch

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    fun check(a1:Int,a2:Int,a3:Int,a4:Int,a5:Int,a6:Int,a7:Int,a8:Int,a9:Int){

        val win: TextView = findViewById(R.id.textView2)
        var end=0
        val e="O WINS!"
        val e2="X WINS!"

        if (a1 == 1 && a2 == 1 && a3 == 1)
            end = 1
        if (a4 == 1 && a5 == 1 && a6 == 1)
            end = 1
        if (a7 == 1 && a8 == 1 && a9 == 1)
            end = 1

        if (a1 == 1 && a4 == 1 && a7 == 1)
            end = 1
        if (a2 == 1 && a5 == 1 && a8 == 1)
            end = 1
        if (a3 == 1 && a6 == 1 && a9 == 1)
            end = 1

        if (a1 == 1 && a5 == 1 && a9 == 1)
            end = 1
        if (a3 == 1 && a5 == 1 && a7 == 1)
            end = 1

        if (a1 == 2 && a2 == 2 && a3 == 2)
            end = 2
        if (a4 == 2 && a5 == 2 && a6 == 2)
            end = 2
        if (a7 == 2 && a8 == 2 && a9 == 2)
            end = 2

        if (a1 == 2 && a4 == 2 && a7 == 2)
            end = 2
        if (a2 == 2 && a5 == 2 && a8 == 2)
            end = 2
        if (a3 == 2 && a6 == 2 && a9 == 2)
            end = 2

        if (a1 == 2 && a5 == 2 && a9 == 2)
            end = 2
        if (a3 == 2 && a5 == 2 && a7 == 2)
            end = 2

        if(end==1){
            win.text = e
            win.setTextColor(Color.RED)
            win.visibility=View.VISIBLE

        } else if(end==2){
            win.text = e2
            win.setTextColor(Color.BLACK)
            win.visibility=View.VISIBLE
        }
    }

    fun tieCheck(){
        val button1: Button = findViewById(R.id.b1)
        val button2: Button = findViewById(R.id.b2)
        val button3: Button = findViewById(R.id.b3)
        val button4: Button = findViewById(R.id.b4)
        val button5: Button = findViewById(R.id.b5)
        val button6: Button = findViewById(R.id.b6)
        val button7: Button = findViewById(R.id.b7)
        val button8: Button = findViewById(R.id.b8)
        val button9: Button = findViewById(R.id.b9)

        val win: TextView = findViewById(R.id.textView2)
        val e3 = "It's a TIE"

        if(!button1.isEnabled && !button2.isEnabled && !button3.isEnabled &&
        !button4.isEnabled && !button5.isEnabled && !button6.isEnabled &&
        !button7.isEnabled && !button8.isEnabled && !button9.isEnabled){

            win.text=e3
            win.setTextColor(Color.BLACK)
            win.visibility=View.VISIBLE
        }
    }

    fun turn(Xturn: Boolean){

        val title: TextView = findViewById(R.id.textView)
        val d="Turn O"
        val d2="Turn X"

        if (Xturn) {
            title.text = d
            title.setTextColor(Color.RED)
        } else {
            title.text = d2
            title.setTextColor(Color.BLACK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.b1)
        val button2: Button = findViewById(R.id.b2)
        val button3: Button = findViewById(R.id.b3)
        val button4: Button = findViewById(R.id.b4)
        val button5: Button = findViewById(R.id.b5)
        val button6: Button = findViewById(R.id.b6)
        val button7: Button = findViewById(R.id.b7)
        val button8: Button = findViewById(R.id.b8)
        val button9: Button = findViewById(R.id.b9)

        val resetButton: Button = findViewById(R.id.reset)

        var Xturn = true

        var a1=0
        var a2=0
        var a3=0
        var a4=0
        var a5=0
        var a6=0
        var a7=0
        var a8=0
        var a9=0

        button1.setOnClickListener {
            button1.visibility = View.VISIBLE
            button1.isEnabled = false
            if (!Xturn) {
                a1=1
            } else {
                a1=2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button2.setOnClickListener {
            button2.visibility = View.VISIBLE
            button2.isEnabled = false
            if (!Xturn) {
                a2=1
            } else {
                a2=2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button3.setOnClickListener {
            button3.visibility = View.VISIBLE
            button3.isEnabled = false
            if (!Xturn) {
                a3=1
            } else {
                a3=2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button4.setOnClickListener {
            button4.visibility = View.VISIBLE
            button4.isEnabled = false
            if (!Xturn) {
                a4 = 1
            } else {
                a4 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button5.setOnClickListener {
            button5.visibility = View.VISIBLE
            button5.isEnabled = false
            if (!Xturn) {
                a5 = 1
            } else {
                a5 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button6.setOnClickListener {
            button6.visibility = View.VISIBLE
            button6.isEnabled = false
            if (!Xturn) {
                a6 = 1
            } else {
                a6 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button7.setOnClickListener {
            button7.visibility = View.VISIBLE
            button7.isEnabled = false
            if (!Xturn) {
                a7 = 1
            } else {
                a7 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button8.setOnClickListener {
            button8.visibility = View.VISIBLE
            button8.isEnabled = false
            if (!Xturn) {
                a8 = 1
            } else {
                a8 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        button9.setOnClickListener {
            button9.visibility = View.VISIBLE
            button9.isEnabled = false
            if (!Xturn) {
                a9 = 1
            } else {
                a9 = 2
            }
            tieCheck()
            check(a1, a2, a3, a4, a5, a6, a7, a8, a9)
            turn(Xturn)
            Xturn=!Xturn
        }

        resetButton.setOnClickListener{
            button9.visibility = View.INVISIBLE
            button9.isEnabled = true
            button8.visibility = View.INVISIBLE
            button8.isEnabled = true
            button7.visibility = View.INVISIBLE
            button7.isEnabled = true
            button6.visibility = View.INVISIBLE
            button6.isEnabled = true
            button5.visibility = View.INVISIBLE
            button5.isEnabled = true
            button4.visibility = View.INVISIBLE
            button4.isEnabled = true
            button3.visibility = View.INVISIBLE
            button3.isEnabled = true
            button2.visibility = View.INVISIBLE
            button2.isEnabled = true
            button1.visibility = View.INVISIBLE
            button1.isEnabled = true
            a1=0
            a2=0
            a3=0
            a4=0
            a5=0
            a6=0
            a7=0
            a8=0
            a9=0
            Xturn=true
            turn(Xturn)
        }
    }
}

