package com.example.humzawatch

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
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

        val title: TextView = findViewById(R.id.textView)
        val win: TextView = findViewById(R.id.textView2)

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
        var end=0
        var cntrl=true

        while (cntrl) {
            if (!Xturn) {
                title.text = "Turn O"
                title.setTextColor(Color.RED)
                button1.setTextColor(Color.RED)
            } else {
                title.text = "Turn X"
                title.setTextColor(Color.BLACK)
                button1.setTextColor(Color.BLACK)
            }


            button1.setOnClickListener {
                button1.visibility = View.VISIBLE
                button1.isEnabled = false
                if (!Xturn) {
                    a1=1
                } else {
                    a1=2
                }
            }

            button2.setOnClickListener {
                button2.visibility = View.VISIBLE
                button2.isEnabled = false
                if (!Xturn) {
                    a2=1
                } else {
                    a2=2
                }
            }

            button3.setOnClickListener {
                button3.visibility = View.VISIBLE
                button3.isEnabled = false
                if (!Xturn) {
                    a3=1
                } else {
                    a3=2
                }
            }

            button4.setOnClickListener {
                button4.visibility = View.VISIBLE
                button4.isEnabled = false
                if (!Xturn) {
                    a4 = 1
                } else {
                    a4 = 2
                }
            }

            button5.setOnClickListener {
                button5.visibility = View.VISIBLE
                button5.isEnabled = false
                if (!Xturn) {
                    a5 = 1
                } else {
                    a5 = 2
                }
            }

            button6.setOnClickListener {
                button6.visibility = View.VISIBLE
                button6.isEnabled = false
                if (!Xturn) {
                    a6 = 1
                } else {
                    a6 = 2
                }
            }

            button7.setOnClickListener {
                button7.visibility = View.VISIBLE
                button7.isEnabled = false
                if (!Xturn) {
                    a7 = 1
                } else {
                    a7 = 2
                }
            }

            button8.setOnClickListener {
                button8.visibility = View.VISIBLE
                button8.isEnabled = false
                if (!Xturn) {
                    a8 = 1
                } else {
                    a8 = 2
                }
            }

            button9.setOnClickListener {
                button9.visibility = View.VISIBLE
                button9.isEnabled = false
                if (!Xturn) {
                    a9 = 1
                } else {
                    a9 = 2
                }
            }

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

            if(end!=1 || end!=2)
                end=3

            if(end==0){
                if(Xturn){
                    Xturn=false
                } else{
                    Xturn=true
                }
            }else{
                cntrl=false
            }
            if(end==1){
                win.text = "O WINS!"
                win.setTextColor(Color.RED)
                win.visibility=View.VISIBLE
            } else if(end==2){
                win.text = "X WINS!"
                win.setTextColor(Color.BLACK)
                win.visibility=View.VISIBLE
            }
        }
    }
}
