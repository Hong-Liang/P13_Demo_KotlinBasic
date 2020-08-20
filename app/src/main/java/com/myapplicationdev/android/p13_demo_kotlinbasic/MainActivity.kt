package com.myapplicationdev.android.p13_demo_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge
        tvShowAge
        etDOB
        tvCate

        btnGetAge.setOnClickListener {
            val DOB = etDOB.text.toString();
            val year = Calendar.getInstance().get(Calendar.YEAR);
            if (DOB.isNotEmpty()) {
                val age = year - DOB.toInt();
                tvShowAge.setText("Your age is: " + age)
                /*
                if (age < 18) {
                    tvCate.setText("Underage")
                }
                else if (age in 18..65) {
                        tvCate.setText("Young People")
                }
                else if (age in 66..79) {
                    tvCate.setText("Middle aged")
                }
                else if (age in 80..99) {
                    tvCate.setText("Elderly")
                } else {
                    tvCate.setText("Long lived Elderly")
                }
                 */

                when (age) {
                    in 0..17 -> tvCate.setText("UnderAge")
                    in 18..65 -> tvCate.setText("Young People")
                    in 66..79 -> tvCate.setText("Middle aged")
                    in 80..99 -> tvCate.setText("Elderly")
                    else -> {
                        tvCate.setText("UnderAge")
                    }
                }
            } else {
                Toast.makeText(applicationContext, "Please enter a year", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
