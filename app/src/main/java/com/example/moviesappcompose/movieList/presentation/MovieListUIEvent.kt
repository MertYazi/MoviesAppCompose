package com.example.moviesappcompose.movieList.presentation

/**
 * Created by Mert Yazi
 */

sealed interface MovieListUIEvent {
    data class Paginate(val category: String): MovieListUIEvent
    data object Navigate: MovieListUIEvent
}