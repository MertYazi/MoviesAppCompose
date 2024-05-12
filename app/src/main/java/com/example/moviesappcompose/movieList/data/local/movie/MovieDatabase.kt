package com.example.moviesappcompose.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.moviesappcompose.movieList.data.local.movie.MovieEntity

/**
 * Created by Mert Yazi
 */

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}