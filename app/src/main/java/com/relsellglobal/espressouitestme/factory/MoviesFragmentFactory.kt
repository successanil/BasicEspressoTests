package com.relsellglobal.espressouitestme.factory

import androidx.fragment.app.FragmentFactory
import com.relsellglobal.espressouitestme.DirectorsFragment
import com.relsellglobal.espressouitestme.MovieDetailFragment
import com.relsellglobal.espressouitestme.StarActorsFragment

class MovieFragmentFactory : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }


}
