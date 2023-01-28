package com.example.kotlinfishermenhandbook

open class UseCaseImpl: UseCase {

    override fun fillArrays(
        titleArray: Array<String>,
        contentArray: Array<String>,
        imageArray: IntArray
    ): List<ListItem> {
        val listItemArray = ArrayList<ListItem>()
        for (n in titleArray.indices) {
            val listItem = ListItem(imageArray[n], titleArray[n], contentArray[n])
            listItemArray.add(listItem)
        }
        return listItemArray
    }
}