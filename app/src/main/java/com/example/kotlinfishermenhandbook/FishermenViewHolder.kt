package com.example.kotlinfishermenhandbook

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.kotlinfishermenhandbook.databinding.ItemLayoutBinding
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem

class FishermenViewHolder(
    binding: ItemLayoutBinding
) : ViewHolder(binding.root) {

    private var tvTitle: TextView = binding.tvTitleShyka
    private var tvContent: TextView = binding.tvContentItem
    private var im: ImageView = binding.ivShuka


    @SuppressLint("SetTextI18n")
    fun bind(listItem: FishermenListItem, context: Context) {
        tvTitle.text = listItem.titleText
        tvContent.text = listItem.contentText.substring(0, 100) + "..."
        im.setImageResource(listItem.image_id)
        itemView.setOnClickListener {
            Toast.makeText(context, "You clicked: ${tvTitle.text}! ", Toast.LENGTH_SHORT).show()
            val i = Intent(context, ContentActivity::class.java).apply {
                putExtra(FishermenAdapter.TITLE, tvTitle.text.toString())
                putExtra(FishermenAdapter.CONTENT, listItem.contentText)
                putExtra(FishermenAdapter.IMAGE, listItem.image_id)
            }
            context.startActivity(i)
        }
    }
}