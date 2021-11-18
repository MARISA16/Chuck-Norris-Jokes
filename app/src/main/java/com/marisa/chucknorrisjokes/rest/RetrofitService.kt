package com.marisa.chucknorrisjokes.rest

import com.marisa.chucknorrisjokes.models.DadosChuck
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {
    @GET("https://api.chucknorris.io/")

    fun getAChuck(): Call<DadosChuck>


    companion object{
        private val  retrofitService : RetrofitService by lazy {
            val  retrofit = Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            retrofit.create( RetrofitService::class.java)
        }

        // instance do retrofitService
        fun  getInstance() : RetrofitService{
            return retrofitService
        }
    }
}