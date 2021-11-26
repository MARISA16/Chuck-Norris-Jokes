package com.marisa.chucknorrisjokes.rest

import com.marisa.chucknorrisjokes.models.DadosChuck
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

 // caminho que estou indo buscar o dados da API ou  seja configurando o retrofit para poder ser usando
// @GET vai me retornar o call do meus dados DadosChuck

interface RetrofitService {
    @GET("/jokes/random")
    fun getChuck(): Call<DadosChuck>


// vai na internet pegar meu value
    //by Bazer vai ser quando quero instanciar meu objeto de uma vez só

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