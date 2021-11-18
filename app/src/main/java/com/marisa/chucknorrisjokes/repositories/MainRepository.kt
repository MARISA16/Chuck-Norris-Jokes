package com.marisa.chucknorrisjokes.repositories

import com.marisa.chucknorrisjokes.rest.RetrofitService

class MainRepository  constructor(private val retrofitService: RetrofitService){

    fun  getAChuck() = retrofitService.getAChuck()

}