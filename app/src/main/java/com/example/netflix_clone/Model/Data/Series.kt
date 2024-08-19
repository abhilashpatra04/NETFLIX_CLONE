package com.example.netflix_clone.Model.Data

import androidx.compose.runtime.Immutable

@Immutable
data class Series(
    val id:String,
    val rank: Int,
    val title: String,
    val image: String,
    val genre: String,
    val rating: Double
)