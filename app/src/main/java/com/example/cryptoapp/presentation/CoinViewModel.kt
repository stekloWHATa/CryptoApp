package com.example.cryptoapp.presentation

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.domain.GetCoinInfoListUseCase
import com.example.cryptoapp.domain.GetCoinInfoUseCase
import com.example.cryptoapp.domain.LoadDataUseCase
import javax.inject.Inject

class CoinViewModel @Inject constructor(
    getCoinInfoListUseCase : GetCoinInfoListUseCase,
    private val getCoinInfoUseCase : GetCoinInfoUseCase,
    loadDataUseCase : LoadDataUseCase
) : ViewModel() {
    val coinInfoList = getCoinInfoListUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }

}