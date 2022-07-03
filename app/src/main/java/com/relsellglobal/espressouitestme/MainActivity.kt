package com.relsellglobal.espressouitestme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.relsellglobal.espressouitestme.databinding.ActivityMainBinding
import com.relsellglobal.espressouitestme.factory.MovieFragmentFactory

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportFragmentManager.fragmentFactory = MovieFragmentFactory()
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        binding.buttonNextActivity.setOnClickListener {
//            launchSecondaryActivity()
//        }

        init()





    }


    fun launchSecondaryActivity() {

            val intent = Intent(this, SecondaryActivity::class.java)
            startActivity(intent)

    }

    private fun init(){
        if(supportFragmentManager.fragments.size == 0){
            val movieId = 1
            val bundle = Bundle()
            bundle.putInt("movie_id", movieId)
            supportFragmentManager.beginTransaction()
                .replace(binding.main.id, MovieDetailFragment::class.java, bundle)
                .commit()
        }
    }



}