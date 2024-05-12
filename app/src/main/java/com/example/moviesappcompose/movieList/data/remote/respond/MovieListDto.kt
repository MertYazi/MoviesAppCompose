package com.example.moviesappcompose.movieList.data.remote.respond

/**
 * Created by Mert Yazi
 */

data class MovieListDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)