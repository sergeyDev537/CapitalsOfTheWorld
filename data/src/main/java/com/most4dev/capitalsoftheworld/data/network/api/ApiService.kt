package com.most4dev.capitalsoftheworld.data.network.api

import com.most4dev.capitalsoftheworld.data.dto.CountriesListItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("all")
    suspend fun getCountriesList(): Response<List<CountriesListItem>>

}