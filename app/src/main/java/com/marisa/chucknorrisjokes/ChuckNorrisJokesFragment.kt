package com.marisa.chucknorrisjokes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.marisa.chucknorrisjokes.databinding.FragmentChuckNorrisJokesBinding
import com.marisa.chucknorrisjokes.viewmodelactivity.ChuckNorrisJokesViewModel

class ChuckNorrisJokesFragment : Fragment() {

    private  val viewModel: ChuckNorrisJokesViewModel by viewModels()
    private lateinit var binding: FragmentChuckNorrisJokesBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentChuckNorrisJokesBinding.inflate(layoutInflater)
        return (binding.root)

        }
         override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            viewModel.getChuck()

        }
             viewModel._joke.observe(viewLifecycleOwner) {
                 binding.chuckNorri.text = it
             }

         }




}