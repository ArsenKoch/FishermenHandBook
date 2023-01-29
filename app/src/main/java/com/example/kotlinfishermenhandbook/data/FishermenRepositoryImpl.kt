package com.example.kotlinfishermenhandbook.data

import android.content.Context
import android.content.res.TypedArray
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem
import com.example.kotlinfishermenhandbook.domain.repository.FishermenRepository

class FishermenRepositoryImpl(private val context: Context) : FishermenRepository {

    override fun fillArrays(
        titleArray: Array<String>, contentArray: Array<String>, imageArray: IntArray
    ): List<FishermenListItem> {
        val listItemArray = ArrayList<FishermenListItem>()
        for (n in titleArray.indices) {
            val listItem = FishermenListItem(imageArray[n], titleArray[n], contentArray[n])
            listItemArray.add(listItem)
        }
        return listItemArray
    }

    override fun getImageId(imageArrayId: Int): IntArray {
        val tArray: TypedArray = context.resources.obtainTypedArray(imageArrayId)
        val count = tArray.length()
        val ids = IntArray(count)
        for (i in ids.indices) {
            ids[i] = tArray.getResourceId(i, 0)
        }
        tArray.recycle()
        return ids
    }
}