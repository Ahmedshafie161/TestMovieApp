package com.example.movieapp

import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("Title")
    val title :String? = "" ,
    @SerializedName("Poster")
    val imageUrl : String ? = "" ,
    @SerializedName("Year")
    val year : String? = "",
    @SerializedName("imdbID")
    val imdbId : String? = "" ,
    @SerializedName("Type")
    val type : String? = "" ,

    )
