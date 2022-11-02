package com.example.affermations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affermations.R
import com.example.affermations.models.Movie


class MovieAdapter(
    private val context: Context,
    private val movies: List<Movie>,
    private val layoutResId: Int
) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {

    class MovieHolder(
        private val itemView: View
    ) :
        RecyclerView.ViewHolder(itemView) {
        private val movieText1: TextView = itemView.findViewById(R.id.movieText1)
        fun bind(movie: Movie) {
            movieText1.setText(movie.movieResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(context).inflate(layoutResId, parent, false)
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.size
}