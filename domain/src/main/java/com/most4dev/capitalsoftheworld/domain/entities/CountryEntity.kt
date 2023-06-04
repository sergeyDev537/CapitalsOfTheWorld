package com.most4dev.capitalsoftheworld.domain.entities

data class CountryEntity(
    val id: Long,
    val name: String,
    val image: String,
    val capital: String,
    val language: String,
    val currency: String
)