package com.example.kotlinfishermenhandbook

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfishermenhandbook.databinding.ItemLayoutBinding

class FishermenAdapter(
    listArray: ArrayList<ListItem>,
    context: Context
) : RecyclerView.Adapter<FishermenViewHolder>() {

    private var listArrayRv = listArray
    private var contextRv = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishermenViewHolder {
        val inflater = LayoutInflater.from(contextRv)
        val binding = ItemLayoutBinding.inflate(inflater, parent, false)
        return FishermenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FishermenViewHolder, position: Int) {

        val listItem = listArrayRv[position]
        holder.bind(listItem, contextRv)
    }

    override fun getItemCount(): Int = listArrayRv.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateAdapter(listArray: List<ListItem>) {
        listArrayRv.clear()
        listArrayRv.addAll(listArray)
        notifyDataSetChanged()
    }

    companion object {
        const val TITLE = "Title"
        const val CONTENT = "Content"
        const val IMAGE = "Image"
    }
}