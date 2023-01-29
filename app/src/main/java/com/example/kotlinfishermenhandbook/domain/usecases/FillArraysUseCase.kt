package com.example.kotlinfishermenhandbook.domain.usecases

import com.example.kotlinfishermenhandbook.domain.entity.FishermenListItem
import com.example.kotlinfishermenhandbook.domain.repository.FishermenRepository

class FillArraysUseCase(
    private val repository: FishermenRepository
) {

    operator fun invoke(
        titleArray: Array<String>,
        contentArray: Array<String>,
        imageArray: IntArray
    ): List<FishermenListItem> {
        return repository.fillArrays(titleArray, contentArray, imageArray)
    }
}