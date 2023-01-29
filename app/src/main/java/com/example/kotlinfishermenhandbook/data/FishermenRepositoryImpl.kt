package com.example.kotlinfishermenhandbook.data

import android.view.MenuItem
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem
import com.example.kotlinfishermenhandbook.domain.repository.FishermenRepository

object FishermenRepositoryImpl : FishermenRepository {
    override fun fillArrays(
        titleArray: Array<String>, contentArray: Array<String>, imageArray: IntArray
    ): List<FishermenListItem> {
        TODO("Not yet implemented")
    }

    override fun getImageId(imageArrayId: Int): IntArray {
        TODO("Not yet implemented")
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
    }
}