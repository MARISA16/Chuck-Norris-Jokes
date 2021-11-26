package com.marisa.chucknorrisjokes.repositories

import com.marisa.chucknorrisjokes.rest.RetrofitService

// vai receber o retrofitService

class Repository{

    fun  getChuck() = RetrofitService.getInstance().getChuck()

}