package com.example.filmssearch3.domain

import android.os.Parcelable
import android.os.Parcel


data class Film(
   val title: String,
   val poster: String,
   val description: String,
   var rating: Double = 0.0,
   var isInFavorites: Boolean = false
) : Parcelable {

   constructor(parcel: Parcel) : this(
      title = parcel.readString() ?: "",
      poster = parcel.readString() ?: "",
      description = parcel.readString() ?: "",
      rating = parcel.readDouble(),
      isInFavorites = parcel.readBoolean()
   )

   override fun writeToParcel(parcel: Parcel, flags: Int) {
      parcel.writeString(title)
      parcel.writeString(poster)
      parcel.writeString(description)
      parcel.writeDouble(rating)
      parcel.writeBoolean(isInFavorites)
   }

   override fun describeContents(): Int = 0

   companion object CREATOR : Parcelable.Creator<Film> {
      override fun createFromParcel(parcel: Parcel): Film {
         return Film(parcel)
      }

      override fun newArray(size: Int): Array<Film?> {
         return arrayOfNulls(size)
      }
   }
}