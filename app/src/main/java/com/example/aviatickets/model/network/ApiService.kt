package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Offer
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("flight/offers")
    fun getFlightOffers(): Call<List<Offer>>

}