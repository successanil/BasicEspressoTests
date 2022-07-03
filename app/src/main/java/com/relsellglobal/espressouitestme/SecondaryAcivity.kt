package com.relsellglobal.espressouitestme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.relsellglobal.espressouitestme.databinding.ActivitySecondaryBinding

class SecondaryActivity : AppCompatActivity() {


    lateinit var binding : ActivitySecondaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_secondary)

        binding.buttonBack.setOnClickListener{
            onBackPressed()
        }
    }

    fun goBack() {
        onBackPressed()
    }
}