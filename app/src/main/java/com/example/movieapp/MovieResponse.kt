package com.example.movieapp

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("Search")
    val search: ArrayList<MovieItem>,
    @SerializedName("totalResults")
    val totalResults:String,
    @SerializedName("Response")
    val response :String ,
)
