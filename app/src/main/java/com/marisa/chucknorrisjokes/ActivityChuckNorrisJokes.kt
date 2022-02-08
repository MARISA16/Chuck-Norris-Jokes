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
        val splashFragment = SplashFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, splashFragment)
            .commit()

        Handler(Looper.getMainLooper()).postDelayed({
            startChuckNorrisJokesFragment()
        }, 3000)
   }

    private fun startChuckNorrisJokesFragment() {
        val norrisjokeFragment = ChuckNorrisJokesFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, norrisjokeFragment)
            .commit()
    }
}

