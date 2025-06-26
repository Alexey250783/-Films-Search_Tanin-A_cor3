package com.example.filmssearch3.domain

import com.example.filmssearch3.data.MainRepository

class Interactor(val repo: MainRepository) {
    fun getFilmsDB(): List<Film> = repo.filmsDataBase
}