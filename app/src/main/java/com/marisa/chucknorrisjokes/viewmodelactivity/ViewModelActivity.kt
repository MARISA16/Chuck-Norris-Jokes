package com.marisa.chucknorrisjokes.viewmodelactivity

import androidx.lifecycle.ViewModel
import com.marisa.chucknorrisjokes.repositories.Repository

//   a fun é minha  resposta
class ViewModelActivity : ViewModel(){
    val repository =Repository()

    fun getChuck(){

        val response = repository.getChuck()


    }
}

