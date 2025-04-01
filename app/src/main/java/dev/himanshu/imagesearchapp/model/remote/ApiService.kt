package dev.himanshu.imagesearchapp.model.remote

import dev.himanshu.imagesearchapp.model.remote.dtos.PixabayResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
// https://pixabay.com/api/?key=40308333-07c19e899666cb68334ed3a46&q=yellow
    @GET("api/")
    suspend fun getImages(
        @Query("key") apiKey:String = "40308333-07c19e899666cb68334ed3a46",
        @Query("q") query:String
    ) : PixabayResponse

}