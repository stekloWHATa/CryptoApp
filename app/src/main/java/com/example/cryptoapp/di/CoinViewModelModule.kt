package com.example.cryptoapp.di

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.presentation.CoinViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface CoinViewModelModule {
    @IntoMap
    @CoinViewModelKey(CoinViewModel::class)
    @Binds
    fun bindCoinViewModel(impl: CoinViewModel) : ViewModel
}