package com.example.kotlinfishermenhandbook

interface UseCase {

    fun fillArrays(
        titleArray: Array<String>,
        contentArray: Array<String>,
        imageArray: IntArray
    ): List<ListItem>
}