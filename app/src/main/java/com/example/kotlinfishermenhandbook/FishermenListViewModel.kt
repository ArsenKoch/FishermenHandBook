package com.example.kotlinfishermenhandbook

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinfishermenhandbook.data.FishermenListener
import com.example.kotlinfishermenhandbook.data.FishermenRepositoryImpl
import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem

class FishermenListViewModel(
    private val impl: FishermenRepositoryImpl
) : ViewModel() {

    private val _fishermenItems = MutableLiveData<List<FishermenListItem>>()
    val fishermenItems: LiveData<List<FishermenListItem>> = _fishermenItems

    private val listener: FishermenListener = {
        _fishermenItems.value = it
    }

    init {
        loadFishermen()
    }

    fun loadFishermen() {
        impl.addListener(listener)
    }

    fun fillArrays(
        titleArray: Array<String>, contentArray: Array<String>, imageArray: IntArray
    ): List<FishermenListItem> {
        return impl.fillArrays(titleArray, contentArray, imageArray)
    }

    fun getImageId(imageArrayId: Int): IntArray {
        return impl.getImageId(imageArrayId)
    }

    override fun onCleared() {
        super.onCleared()
        impl.removeListener(listener)
    }
}
