package com.example.cryptoapp.domain

data class CoinInfo(
    val type: String?,
    val market: String?,
    val fromSymbol: String,
    val toSymbol: String?,
    val price: String?,
    val lastUpdate: Long?,
    val highDay: String?,
    val lowDay: String?,
    val lastMarket: String?,
    val imageUrl: String?
)