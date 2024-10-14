package com.example.cryptoapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class CoinViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>//в таком
// случае ключи в мапе будут те же самые, а вот вьюмодель при каждом вызове get будет создаваться новая
): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T
    }
}