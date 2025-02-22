package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.data.database.AppDatabase
import com.example.cryptoapp.data.database.CoinInfoDao
import com.example.cryptoapp.data.database.CoinInfoDbModel
import com.example.cryptoapp.data.network.ApiFactory
import com.example.cryptoapp.data.network.ApiService
import com.example.cryptoapp.data.network.model.CoinInfoDto
import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository
    companion object{

        @ApplicationScope
        @Provides
        fun provideCoinInfoDao(
            application: Application
        ): CoinInfoDao{
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }

        @ApplicationScope
        @Provides
        fun provideApiService(): ApiService = ApiFactory.apiService
    }
}
