package com.example.kotlinfishermenhandbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*


class ContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        tvTitle.text = intent.getStringExtra("Title")
        tvContent.text = intent.getStringExtra("Content")
        imageView2.setImageResource(intent.getIntExtra("Image", R.drawable.img_shyka))
    }

}