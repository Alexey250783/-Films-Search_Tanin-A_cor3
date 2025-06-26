package com.example.filmssearch3.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import android.os.Parcel


@Parcelize
data class Film(
    val title: String,
    val poster: Int,
    val description: String,
    var rating: Float = 0f,
    var isInFavorites: Boolean = false
) : Parcelable