package com.example.moviesappcompose.di

import com.example.moviesappcompose.movieList.data.repository.MovieListRepositoryImpl
import com.example.moviesappcompose.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Mert Yazi
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModel {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository
}