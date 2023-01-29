package com.example.kotlinfishermenhandbook.domain.usecases

import android.view.MenuItem
import com.example.kotlinfishermenhandbook.domain.repository.FishermenRepository

class NavigationItemUseCase(
    private val repository: FishermenRepository
) {

    operator fun invoke(item: MenuItem): Boolean {
        return repository.onNavigationItemSelected(item)
    }
}