package com.example.kotlinfishermenhandbook.domain.repository

import android.view.MenuItem
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem

interface FishermenRepository {

    fun fillArrays(
        titleArray: Array<String>,
        contentArray: Array<String>,
        imageArray: IntArray
    ): List<FishermenListItem>

    fun getImageId(imageArrayId: Int): IntArray

    fun onNavigationItemSelected(item: MenuItem): Boolean
}