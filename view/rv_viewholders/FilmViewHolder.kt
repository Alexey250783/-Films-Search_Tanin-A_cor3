package com.example.filmssearch3.view.rv_viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.filmssearch3.domain.Film
import com.bumptech.glide.Glide
import com.example.filmssearch3.databinding.FilmItemBinding // Импорт сгенерированного binding класса

class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(film: Film) {
        binding.title.text = film.title
        binding.description.text = film.description

        Glide.with(itemView)
            .load(film.poster)
            .centerCrop()
            .into(binding.poster)

        val ratingProgress = (film.rating * 10).toInt()
        binding.ratingDonut.setProgress(ratingProgress.coerceIn(0, 100))
    }
}