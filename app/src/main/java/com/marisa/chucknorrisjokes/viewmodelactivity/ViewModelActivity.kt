package com.marisa.chucknorrisjokes.viewmodelactivity

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marisa.chucknorrisjokes.models.DadosChuck
import com.marisa.chucknorrisjokes.repositories.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//   a fun é minha  resposta
class ChuckNorrisJokesViewModel(repository: Repository) : ViewModel(){
     private val joke= MutableLiveData<String>()
    val _joke: LiveData<String> =joke
    val repository =Repository()

    fun getChuck(){

        val result = repository.getChuck()

        result.enqueue(object : Callback<DadosChuck> {
            override fun onResponse(call: Call<DadosChuck>?, response: Response<DadosChuck>?) {
                if (response?.code() == 200) {
                    val dadosChuck = response.body()
                    joke.postValue(dadosChuck?.value)
                }
            }

            override fun onFailure(call: Call<DadosChuck>?, t: Throwable?) {

            }
        })


    }
}

