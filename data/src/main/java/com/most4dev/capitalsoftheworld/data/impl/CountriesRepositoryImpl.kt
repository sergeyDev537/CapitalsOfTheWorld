package com.most4dev.capitalsoftheworld.data.impl

import com.most4dev.capitalsoftheworld.data.network.api.ApiService
import com.most4dev.capitalsoftheworld.domain.common.CallErrors
import com.most4dev.capitalsoftheworld.domain.entities.CountryEntity
import com.most4dev.capitalsoftheworld.domain.repository.CountryRepository
import com.most4dev.capitalsoftheworld.domain.common.Result
import kotlinx.coroutines.flow.Flow
import com.most4dev.capitalsoftheworld.data.common.applyCommonSideEffects
import com.most4dev.capitalsoftheworld.data.mappers.CountriesMapper
import kotlinx.coroutines.flow.flow

class CountriesRepositoryImpl(
    private val api: ApiService,
    private val countriesMapper: CountriesMapper
    ) : CountryRepository {

    override fun getListCountry(): Flow<Result<List<CountryEntity>>> = flow {
        api.getCountriesList().run {
            if (this.isSuccessful) {
                if (this.body() == null) {
                    emit(Result.Error(CallErrors.ErrorEmptyData))
                } else {
                    this.body()?.let {
                        emit(Result.Success(countriesMapper.mapListDtoToListEntity(it)))
                    } ?: kotlin.run {
                        emit(Result.Error(CallErrors.ErrorEmptyData))
                    }
                }
            } else {
                emit(Result.Error(CallErrors.ErrorServer))
            }
        }
    }.applyCommonSideEffects()
}