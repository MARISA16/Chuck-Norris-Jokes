package com.marisa.chucknorrisjokes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marisa.chucknorrisjokes.databinding.ActivityChuckNorrisJokesBinding
import com.marisa.chucknorrisjokes.databinding.SplashActivityBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: SplashActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startActivity(
            Intent(this@SplashActivity,ActivityChuckNorrisJokes::class.java)
        )
        finish()
    }
}