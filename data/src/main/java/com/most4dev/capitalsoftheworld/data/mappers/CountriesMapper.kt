package com.most4dev.capitalsoftheworld.data.mappers

import com.most4dev.capitalsoftheworld.data.dto.CountriesListItem
import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity

class CountriesMapper {

    fun mapListDtoToListEntity(countriesList: List<CountriesListItem>) =
        countriesList.map {
            mapDtoToEntity(it)
        }

    private fun mapDtoToEntity(countriesListItem: CountriesListItem): CountryEntity =
        CountryEntity(
            name = countriesListItem.name.common,
            image = countriesListItem.flags.svg,
            capital = countriesListItem.capital.toString(),
            language = countriesListItem.languages.toString(),
            currency = countriesListItem.currencies.toString()
        )
}