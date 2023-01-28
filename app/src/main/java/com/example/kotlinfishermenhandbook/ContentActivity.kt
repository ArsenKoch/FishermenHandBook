package com.example.kotlinfishermenhandbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinfishermenhandbook.FishermenAdapter.Companion.CONTENT
import com.example.kotlinfishermenhandbook.FishermenAdapter.Companion.IMAGE
import com.example.kotlinfishermenhandbook.FishermenAdapter.Companion.TITLE
import kotlinx.android.synthetic.main.content_layout.*


class ContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        tvTitle.text = intent.getStringExtra(TITLE)
        tvContent.text = intent.getStringExtra(CONTENT)
        ivAnchor.setImageResource(intent.getIntExtra(IMAGE, R.drawable.img_shyka))
    }
}