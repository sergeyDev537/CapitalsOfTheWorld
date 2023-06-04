package com.most4dev.capitalsoftheworld.domain.repository

import com.most4dev.capitalsoftheworld.domain.common.Result
import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity
import kotlinx.coroutines.flow.Flow

interface CountryRepository {

    fun getListCountry(): Flow<Result<List<CountryEntity>>>

}