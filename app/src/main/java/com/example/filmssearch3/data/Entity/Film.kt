package com.example.filmssearch3.domain

import android.annotation.SuppressLint
import android.os.Build
import android.os.Parcelable
import android.os.Parcel
import androidx.annotation.RequiresApi

@SuppressLint("ParcelCreator")
@Parcelize
data class Film(
   val title: String,
   val poster: String,
   val description: String,
   var rating: Double = 0.0,
   var isInFavorites: Boolean = false
) : Parcelable {
   override fun describeContents(): Int {
      return 0
   }

   @RequiresApi(Build.VERSION_CODES.Q)
   override fun writeToParcel(dest: Parcel, flags: Int) {
      dest.writeString(title)
      dest.writeString(poster)
      dest.writeString(description)
      dest.writeDouble(rating)
      dest.writeBoolean(isInFavorites)
   }
}

annotation class Parcelize
