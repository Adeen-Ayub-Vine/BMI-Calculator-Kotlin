package com.adeen.bmicalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.adeen.bmicalculator.databinding.ActivityMainBinding
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun calculateBMI(view: View){
        val weight = binding.weightText.text.toString().toFloatOrNull()
        val height = binding.heightText.text.toString().toFloatOrNull()

        if (weight !=null && height !=null){
            val bmi = weight / (height/100).pow(2)
            val res = String.format("%.2f",bmi)

            val category = when {
                bmi < 18.5 -> "Underweight"
                bmi < 25 -> "Healthy"
                bmi < 30 -> "Overweight"
                bmi < 35 -> "Obese"
                bmi < 40 -> "Highly Obese"
                else -> "Extremely Obese"
            }
            binding.bmiResult1.text = res
            binding.bmiResult2.text = category
        }
        else {
            binding.bmiResult1.text = "Invalid Input"
        }
    }
}