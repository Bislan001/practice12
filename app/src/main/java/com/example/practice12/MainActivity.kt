package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var on: Boolean = true
    fun RadioButton1(view: View){
        val radioBtn4 = findViewById<RadioButton>(R.id.radioButton4)
        val radioBtn5 = findViewById<RadioButton>(R.id.radioButton5)
        val radioBtn6 = findViewById<RadioButton>(R.id.radioButton6)
        val ImageView1 = findViewById<ImageView>(R.id.imageView1)
        if (radioBtn4.isChecked){
            ImageView1.setImageResource(R.drawable.apple)
        }
        if (radioBtn5.isChecked){
            ImageView1.setImageResource(R.drawable.grusha)
        }
        if (radioBtn6.isChecked){
            ImageView1.setImageResource(R.drawable.vinograde)
        }



    }


    fun Images(view: View) {
        val ImageView2 = findViewById<ImageView>(R.id.imageView2)
        val ImageView3 = findViewById<ImageView>(R.id.imageView3)
        val ImageView4 = findViewById<ImageView>(R.id.imageView4)
        val CheckBox = findViewById<CheckBox>(R.id.checkBox)
        val CheckBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val CheckBox3 = findViewById<CheckBox>(R.id.checkBox3)
        if (CheckBox.isChecked){
            ImageView2.setImageResource(R.drawable.apple)
            ImageView2.visibility = View.VISIBLE
            ImageView3.visibility = View.INVISIBLE
            ImageView4.visibility = View.INVISIBLE

        }
        if (CheckBox2.isChecked) {
            ImageView3.setImageResource(R.drawable.grusha)
            ImageView2.visibility = View.INVISIBLE
            ImageView3.visibility = View.VISIBLE
            ImageView4.visibility = View.INVISIBLE

        }
        if (CheckBox3.isChecked){
            ImageView4.setImageResource(R.drawable.vinograde)
            ImageView2.visibility = View.INVISIBLE
            ImageView3.visibility = View.INVISIBLE
            ImageView4.visibility = View.VISIBLE
        }
        if (CheckBox.isChecked && CheckBox2.isChecked){
            ImageView4.setImageResource(R.drawable.vinograde)
            ImageView2.visibility = View.VISIBLE
            ImageView3.visibility = View.VISIBLE
            ImageView4.visibility = View.INVISIBLE
        }
        if (CheckBox3.isChecked && CheckBox2.isChecked){
            ImageView4.setImageResource(R.drawable.vinograde)
            ImageView2.visibility = View.INVISIBLE
            ImageView3.visibility = View.VISIBLE
            ImageView4.visibility = View.VISIBLE
        }
        if (CheckBox3.isChecked && CheckBox2.isChecked && CheckBox.isChecked){
            ImageView4.setImageResource(R.drawable.vinograde)
            ImageView2.visibility = View.VISIBLE
            ImageView3.visibility = View.VISIBLE
            ImageView4.visibility = View.VISIBLE
        }



    }
}





/* val radioButton1 = findViewById<RadioButton>(R.id.radioButton)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val ImageView1 = findViewById<ImageView>(R.id.imageView1) */