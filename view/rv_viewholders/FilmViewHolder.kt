package com.example.filmssearch3.view.rv_viewholders

import androidx.recyclerview.widget.RecyclerView
import com.example.filmssearch3.data.entity.Film
import com.bumptech.glide.Glide
import com.example.filmssearch3.data.ApiConstants
import com.example.filmssearch3.databinding.FilmItemBinding

//В конструктор класс передается layout, который мы создали(film_item.xml)
class FilmViewHolder(private val binding: FilmItemBinding) : RecyclerView.ViewHolder(binding.root) {
    //Привязываем view из layout к переменным
    private val title = binding.title
    private val poster = binding.poster
    private val description = binding.description
    //Вот здесь мы находим в верстке наш прогресс бар для рейтинга
    private val ratingDonut = binding.ratingDonut



    //В этом методе кладем данные из film в наши view
    fun bind(film: Film) {
        //Устанавливаем заголовок
        binding.title.text = film.title
        //Устанавливаем постер
        //Указываем контейнер, в которм будет "жить" наша картинка
        Glide.with(itemView)
            //Загружаем сам ресурс
            .load(ApiConstants.IMAGES_URL + "w342" + film.poster)
            //Центруем изображение
            .centerCrop()
            //Указываем ImageView, куда будем загружать изображение
            .into(binding.poster)
        //Устанавливаем описание
        binding.description.text = film.description
        //Устанавливаем рэйтинг
        binding.ratingDonut.setProgress((film.rating * 10).toInt())
    }
}