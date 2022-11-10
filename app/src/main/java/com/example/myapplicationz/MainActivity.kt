package com.example.myapplicationz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click=findViewById<Button>(R.id.muButton)
        val numFirst=findViewById<EditText>(R.id.first)
        val numID=findViewById<EditText>(R.id.number)
        val numLast=findViewById<EditText>(R.id.last)
        val numTech=findViewById<EditText>(R.id.editTech)


        btn_click.setOnClickListener {

            val resultFirst=numFirst.text.toString()
            val resultLast=numLast.text.toString()
            val resultID=numID.text.toString()
            val resultTech=numTech.text.toString()



            if (resultFirst==""||resultLast==""||resultID==""||resultTech==""){
                Toast.makeText(this@MainActivity,"გრაფა ცარიელია",Toast.LENGTH_SHORT).show()
            }else if(numFirst.length() <2 || numLast.length() < 2 || numID.length() < 3){
                Toast.makeText(this@MainActivity,"ავტომობილის ნომერი არასწორია",Toast.LENGTH_SHORT).show()
            }else if(resultFirst.any{it.isDigit()}||resultLast.any{it.isDigit()}){
                Toast.makeText(this@MainActivity,"ავტომობილის ნომერი არასწორია",Toast.LENGTH_SHORT).show()
            }else if (numTech.length() <9){
                Toast.makeText(this@MainActivity,"ტექ-პასპორტის ნომერი არასწორია",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MainActivity,"თქვენ გავლილი გაქვსთ ტექ-დათვალიერება",Toast.LENGTH_SHORT).show()
            }









        }









    }
}