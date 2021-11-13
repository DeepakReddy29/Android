package com.example.secondca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.edt1)
        val Rgrp = findViewById<RadioGroup>(R.id.RG1)
        val btn1 = findViewById<RadioButton>(R.id.RdBtn1)
        val btn2 = findViewById<RadioButton>(R.id.RdBtn2)
        val btn3 = findViewById<RadioButton>(R.id.RbBtn3)


        val java = findViewById<CheckBox>(R.id.cck1)
        val kotlin = findViewById<CheckBox>(R.id.cck2)
        val python = findViewById<CheckBox>(R.id.cck3)
        val javascript = findViewById<CheckBox>(R.id.cck4)
        val btnsubmit = findViewById<Button>(R.id.btnca)

        val result = findViewById<TextView>(R.id.Output)

        java.setOnClickListener {
            if (java.isChecked)
                Toast.makeText(applicationContext, "You selected Java", Toast.LENGTH_SHORT).show()
        }
        kotlin.setOnClickListener{
            if(kotlin.isChecked)
                Toast.makeText(applicationContext,"You selected Kotkin",Toast.LENGTH_SHORT).show()

        }
        python.setOnClickListener{
            if(python.isChecked)
                Toast.makeText(applicationContext,"You selected Python",Toast.LENGTH_SHORT).show()

        }
        javascript.setOnClickListener{
            if(javascript.isChecked)
                Toast.makeText(applicationContext,"You selected Javascript",Toast.LENGTH_SHORT).show()

        }
        btn1.setOnClickListener{
            if(btn1.isChecked)
                Toast.makeText(applicationContext,"You selectd Male",Toast.LENGTH_SHORT).show()

        }
        btn2.setOnClickListener{
            if(btn2.isChecked)
                Toast.makeText(applicationContext,"You selectd Female",Toast.LENGTH_SHORT).show()

        }
        btn3.setOnClickListener{
            if(btn3.isChecked)
                Toast.makeText(applicationContext,"You selectd TransGender",Toast.LENGTH_SHORT).show()

        }
        btnsubmit.setOnClickListener{
            if(name.text.toString().isEmpty())
            {
                result.text = "Fill all the name"
                Toast.makeText(applicationContext,"Enter the name",Toast.LENGTH_SHORT).show()

            }
            else
            {
                var amount:Int = 0
                if(java.isChecked)
                    amount+=500
                if(kotlin.isChecked)
                    amount+=450
                if(python.isChecked)
                    amount+=500
                if(javascript.isChecked)
                    amount+=400

                var totls:String = amount.toString()

                val selectId:Int = Rgrp.checkedRadioButtonId
                    radioButton = findViewById(selectId)
                    var out:String = radioButton.text.toString()
                    result.text = "selected: $out"
                result.text=
                    """
             
                        Name: ${name.text}
                        Sex: $out
                        Total Amount: $totls
                       
                    """.trimIndent()
            }
        }
    }
}