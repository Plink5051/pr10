package com.example.practice10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linerlayout)
        setTitle("LinerLayout")
    }

    fun button_Click(view: View) {
        val textView2: TextView = findViewById(R.id.textView2)
        val textView4: TextView = findViewById(R.id.textView4)
        when (view.id){
            R.id.button3->{
                textView2.setText("Вертикальная")
            }
            R.id.button4->{
                textView4.setText("По левому краю")
            }
            R.id.button5->{
                textView2.setText("Горизонтальная")
            }
            R.id.button6->{
                textView4.setText("По центру")
            }
            R.id.button7->{
                textView2.setText("Вертикальная")
            }
            R.id.button8->{
                textView4.setText("По правому краю")
            }
        }
    }

    fun buttonVisibility(view: View) {
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        when (view.id) {
            R.id.button1->{
                button1.visibility=View.GONE
                button2.visibility=View.VISIBLE
            }
            R.id.button2->{
                button2.visibility=View.GONE
                button1.visibility=View.VISIBLE
            }
        }
    }
}