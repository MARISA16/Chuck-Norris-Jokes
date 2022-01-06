package com.marisa.chucknorrisjokes

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.marisa.chucknorrisjokes.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val intent = Intent(this@SplashFragment,ChuckNorrisJokesFragment::class.java)
//        startActivity(intent)
//        startActivity(
//            Intent(this@SplashFragment,ChuckNorrisJokesFragment::class.java)
//        )
//        finish()
    }


    }




