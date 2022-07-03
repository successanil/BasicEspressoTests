package com.relsellglobal.espressouitestme.data.source

import com.relsellglobal.espressouitestme.data.Movie


interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}