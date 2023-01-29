package com.example.kotlinfishermenhandbook.domain.usecases

import com.example.kotlinfishermenhandbook.domain.repository.FishermenRepository

class GetImageIdUseCase(
    private val repository: FishermenRepository
) {

    operator fun invoke(imageArrayId: Int): IntArray {
        return repository.getImageId(imageArrayId)
    }
}