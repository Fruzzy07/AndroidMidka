package com.example.aviatickets.model.entity

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("offers")
    suspend fun getOffers(): Response<OfferResponse>
}
