package com.COMP583.Drinkly.api

import com.COMP583.Drinkly.CocktailResponse
import com.COMP583.Drinkly.util.Constants.Companion.COCKTAIL_API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailAPI {

    @GET("filters")
    suspend fun getBreakingNews(
        @Query("filter")
        countryCode: String = "Cocktail",
        @Query("apiKey")
        apiKey: String = COCKTAIL_API_KEY
    ): Response<CocktailResponse>


}