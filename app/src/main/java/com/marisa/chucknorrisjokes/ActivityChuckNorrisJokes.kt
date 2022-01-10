package com.marisa.chucknorrisjokes

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.marisa.chucknorrisjokes.databinding.ActivityChuckNorrisJokesBinding

class ActivityChuckNorrisJokes : AppCompatActivity() {

    private lateinit var binding: ActivityChuckNorrisJokesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChuckNorrisJokesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startSplashFragment()
    }

    private fun startSplashFragment() {
        val splashFragment: SplashFragment = SplashFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragmentContainer,
                splashFragment
            )
            .commit()

        Handler(Looper.getMainLooper()).postDelayed({
            startMainFragment()
        }, 3000)
    }

    private fun startMainFragment() {
        val jokeFragment: ChuckNorrisJokesFragment = ChuckNorrisJokesFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragmentContainer,
                jokeFragment
            )
            .commit()
    }
}
