package com.example.moviesappcompose.details.presentation

import com.example.moviesappcompose.movieList.domain.model.Movie

/**
 * Created by Mert Yazi
 */

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
