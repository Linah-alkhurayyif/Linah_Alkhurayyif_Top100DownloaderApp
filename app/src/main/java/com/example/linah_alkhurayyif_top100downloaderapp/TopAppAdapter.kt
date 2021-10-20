package com.example.linah_alkhurayyif_top100downloaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_cardview.view.*

class TopAppAdapter(private val topApps:ArrayList<TopAppDetails>): RecyclerView.Adapter<TopAppAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.items_cardview,
            parent,
            false
        )
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val topApp =topApps[position]
        holder.itemView.apply{
            topApp_tv.text=topApp.title
            topAppNum_tv.text ="${position+1}"
        }

    }

    override fun getItemCount()= topApps.size
}