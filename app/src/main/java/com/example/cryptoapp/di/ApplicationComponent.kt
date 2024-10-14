package com.example.cryptoapp.di

import android.app.Application
import android.content.Context
import com.example.cryptoapp.presentation.CoinApp
import com.example.cryptoapp.presentation.CoinDetailFragment
import com.example.cryptoapp.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, CoinViewModelModule::class])
interface ApplicationComponent {
    fun inject(activity: CoinPriceListActivity)
    fun inject(fragment: CoinDetailFragment)
    fun inject(app: CoinApp)
    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}