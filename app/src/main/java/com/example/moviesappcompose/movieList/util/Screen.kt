package com.example.moviesappcompose.movieList.util

/**
 * Created by Mert Yazi
 */

sealed class Screen(val rout: String) {
    data object Home : Screen("main")
    data object PopularMovieList : Screen("popularMovie")
    data object UpcomingMovieList : Screen("upcomingMovie")
    data object Details : Screen("details")
}
