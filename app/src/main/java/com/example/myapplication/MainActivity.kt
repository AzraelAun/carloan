package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalculate = findViewById<TextView>(R.id.btnCalculate)

        btnCalculate.setOnClickListener(){
            val textView3:String = editText_CarPrice.toString()
            val textView4:String = editText_Down.toString()
            val textView5:String = editText_Interest.toString()
            val textView6:String = editText_Loan.toString()

            txtOutput_Carloan.text = ".2f".format(CarloanR)
            val value:Double = input.toDouble()

            val result:Double = value * 0.123

            txtOutput_Carloan = ".2f".format(result)

        }
    }


}
