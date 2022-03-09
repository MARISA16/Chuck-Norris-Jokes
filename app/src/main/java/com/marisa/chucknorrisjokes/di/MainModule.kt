package com.marisa.chucknorrisjokes.di

import com.marisa.chucknorrisjokes.repositories.Repository
import com.marisa.chucknorrisjokes.viewmodelactivity.ChuckNorrisJokesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module
// Yaqui faro as declarations das mines dependencies
val mainModule = module {
    factory {
        Repository()
    }
viewModel {
    ChuckNorrisJokesViewModel(
        repository= get()
    )
}
}