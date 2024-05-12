package com.example.moviesappcompose.movieList.presentation

import com.example.moviesappcompose.movieList.domain.model.Movie

/**
 * Created by Mert Yazi
 */

data class MovieListState(
    val isLoading: Boolean = false,
    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,
    val isCurrentPopularScreen: Boolean = true,
    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)