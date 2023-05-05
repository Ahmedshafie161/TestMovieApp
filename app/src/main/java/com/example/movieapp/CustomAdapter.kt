package com.example.movieapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CustomAdapter (private var myList:ArrayList<MovieItem>):
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    class MyViewHolder (val view : View) : RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val tvTitle: TextView = view.findViewById(R.id.tv_movieTitle)
        fun addDataToView(movie:MovieItem){
            tvTitle.text= movie.title
            Glide.with(view)
                .load(movie.imageUrl)
                .override(300,200)
                .into(imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.addDataToView(myList[position])
    }

    override fun getItemCount(): Int {
        return myList.size
    }
    fun updateList(myList:ArrayList<MovieItem>){
        this.myList = myList
        notifyDataSetChanged()
    }
}