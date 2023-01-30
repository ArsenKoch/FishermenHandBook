package com.example.kotlinfishermenhandbook

import android.app.Activity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FishermenViewModelFactory(
    private val app: App
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = when (modelClass) {
            FishermenListViewModel::class.java -> {
                FishermenListViewModel(app.impl)
            }
            else -> {
                throw java.lang.IllegalStateException("Unknown view model class")
            }
        }
        return viewModel as T
    }
}
fun Activity.factory() = FishermenViewModelFactory(applicationContext as App)
