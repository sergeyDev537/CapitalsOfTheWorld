package com.most4dev.capitalsoftheworld.domain.usecases

import com.most4dev.capitalsoftheworld.domain.common.Result
import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity
import com.most4dev.capitalsoftheworld.domain.repository.CountryRepository
import kotlinx.coroutines.flow.Flow

class GetCountryListUseCase(private val countryRepository: CountryRepository) {

    suspend operator fun invoke(): Flow<Result<List<CountryEntity>>> {
        return countryRepository.getListCountry()
    }

}