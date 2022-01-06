package com.marisa.chucknorrisjokes

import android.content.Context
import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.marisa.chucknorrisjokes.databinding.ActivityChuckNorrisJokesBinding


class ActivityChuckNorrisJokes : AppCompatActivity() {

    private lateinit var binding: ActivityChuckNorrisJokesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChuckNorrisJokesBinding.inflate(layoutInflater)
        setContentView(binding.root)

//     var splashFragmentTeste = SplashFragment()
//
//      splashFragmentTeste.startActivity( Intent(this,ChuckNorrisJokesFragment::class.java)
//finish()
        tostartFragment()


    }
    private fun tostartFragment() {
        val navigation = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
        navigation.navController.setGraph(R.navigation.chuck_norris_nav_graph)
    }

     private fun inint(context: Context) {
        val intent = ActivityChuckNorrisJokes.getIntent(context)
        context.startActivity(intent)
    }
    companion object {
        fun getIntent(context: Context) = Intent(
            context, ActivityChuckNorrisJokes::class.java
        )
    }
}

