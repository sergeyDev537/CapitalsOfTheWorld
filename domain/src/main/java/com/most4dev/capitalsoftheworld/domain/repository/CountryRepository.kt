package com.most4dev.capitalsoftheworld.domain.repository

import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity

interface CountryRepository {

    fun getListCountry(): List<CountryEntity>

}