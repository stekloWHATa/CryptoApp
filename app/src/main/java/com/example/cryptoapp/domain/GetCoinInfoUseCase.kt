package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData
import javax.inject.Inject

class GetCoinInfoUseCase @Inject constructor(
    private val repository: CoinRepository
){
    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}