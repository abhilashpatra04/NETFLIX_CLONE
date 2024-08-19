package com.example.netflix_clone.Model.Data

import androidx.compose.runtime.Immutable

@Immutable
data class Movie(
    val id : String,
    val rank: Int,
    val title: String,
    val image: String,
    val genre: String,
    val rating: Double
)

