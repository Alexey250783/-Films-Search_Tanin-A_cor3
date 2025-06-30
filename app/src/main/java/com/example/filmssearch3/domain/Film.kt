package com.example.filmssearch3.domain

import android.annotation.SuppressLint
import android.os.Parcelable
import android.os.Parcel

@SuppressLint("ParcelCreator")
@Parcelize
data class Film(
   val title: String,
   val poster: Int,
   val description: String,
   var rating: Float = 0f,
   var isInFavorites: Boolean = false
) : Parcelable {
   override fun describeContents(): Int {
      return 0
   }

   override fun writeToParcel(dest: Parcel, flags: Int) {
      dest.writeString(title)
      dest.writeInt(poster)
      dest.writeString(description)
      dest.writeFloat(rating)
      dest.writeBoolean(isInFavorites)
   }
}

annotation class Parcelize
