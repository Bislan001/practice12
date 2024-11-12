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
    fun RadioButton1(view: View) {
        val radioBtn4 = findViewById<RadioButton>(R.id.radioButton4)
        val radioBtn5 = findViewById<RadioButton>(R.id.radioButton5)
        val radioBtn6 = findViewById<RadioButton>(R.id.radioButton6)
        val ImageView1 = findViewById<ImageView>(R.id.imageView1)
        if (radioBtn4.isChecked) {
            ImageView1.setImageResource(R.drawable.apple)
        }
        if (radioBtn5.isChecked) {
            ImageView1.setImageResource(R.drawable.grusha)
        }
        if (radioBtn6.isChecked) {
            ImageView1.setImageResource(R.drawable.vinograde)
        }


    }


    fun Images(view: View) {
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)

        val imageView = findViewById<ImageView>(R.id.imageView1)
        when (checked) {

            R.id.radioButton4 -> imageView.setImageResource(R.drawable.apple)
            R.id.radioButton5 -> imageView.setImageResource(R.drawable.grusha)
            R.id.radioButton6 -> imageView.setImageResource(R.drawable.vinograde)
        }



        checkBox1.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                imageView2.setImageResource(R.drawable.apple)
            } else {
                imageView2.setImageDrawable(null)
            }


        }
        checkBox2.setOnCheckedChangeListener { _, checked ->

            if (checked) {
                imageView3.setImageResource(R.drawable.grusha)
            } else {
                imageView3.setImageDrawable(null)
            }
        }

        checkBox3.setOnCheckedChangeListener { _, checked ->

            if (checked) {
                imageView4.setImageResource(R.drawable.vinograde)
            } else {
                imageView4.setImageDrawable(null)
            }
        }
    }
    }






/* val radioButton1 = findViewById<RadioButton>(R.id.radioButton)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val ImageView1 = findViewById<ImageView>(R.id.imageView1) */