package com.example.affermations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.affermations.adapters.MovieAdapter
import com.example.affermations.databinding.ActivityMainBinding
import com.example.affermations.datasources.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = DataSource().loadMovies()
        val adapter = MovieAdapter(
            this,
            movies,
            R.layout.simple_row_layout
        )
        binding.movieList.layoutManager = LinearLayoutManager(this)
        binding.movieList.adapter = adapter

    }
}