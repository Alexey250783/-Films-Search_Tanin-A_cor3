package com.example.filmssearch3.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.filmssearch3.data.dao.FilmDao
import com.example.filmssearch3.data.entity.Film

@Database(entities = [Film::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
}
