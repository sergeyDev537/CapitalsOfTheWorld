package com.most4dev.capitalsoftheworld.domain.usecases

import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity
import com.most4dev.capitalsoftheworld.domain.repository.CountryRepository

class GetCountryListUseCase(private val countryRepository: CountryRepository) {

    suspend operator fun invoke(): List<CountryEntity> {
        return countryRepository.getListCountry()
    }

}