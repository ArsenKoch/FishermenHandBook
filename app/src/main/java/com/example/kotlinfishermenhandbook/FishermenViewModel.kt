package com.example.kotlinfishermenhandbook

import android.content.res.TypedArray
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem

class FishermenViewModel() : ViewModel() {

    private val _fishermenItems = MutableLiveData<List<FishermenListItem>>()
    val fishermenItems: LiveData<List<FishermenListItem>> = _fishermenItems

//    fun fillArrays(
//        titleArray: Array<String>, contentArray: Array<String>, imageArray: IntArray
//    ): List<FishermenListItem> {
//        val listItemArray = ArrayList<FishermenListItem>()
//        for (n in titleArray.indices) {
//            val listItem = FishermenListItem(imageArray[n], titleArray[n], contentArray[n])
//            listItemArray.add(listItem)
//        }
//        return listItemArray
//    }
//
//    fun getImageId(imageArrayId: Int): IntArray {
//        val tArray: TypedArray = context.resources.obtainTypedArray(imageArrayId)
//        val count = tArray.length()
//        val ids = IntArray(count)
//        for (i in ids.indices) {
//            ids[i] = tArray.getResourceId(i, 0)
//        }
//        tArray.recycle()
//        return ids
//    }
}