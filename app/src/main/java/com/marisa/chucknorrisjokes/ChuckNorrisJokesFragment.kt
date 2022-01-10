package com.marisa.chucknorrisjokes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.marisa.chucknorrisjokes.databinding.FragmentChuckNorrisJokesBinding
import com.marisa.chucknorrisjokes.models.DadosChuck
import com.marisa.chucknorrisjokes.repositories.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ChuckNorrisJokesFragment : Fragment() {

    private lateinit var binding: FragmentChuckNorrisJokesBinding

    private val repository = Repository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentChuckNorrisJokesBinding.inflate(layoutInflater)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            click()
        }
    }

    private fun click() {
        val result = repository.getChuck()

        result.enqueue(object : Callback<DadosChuck> {
            override fun onResponse(call: Call<DadosChuck>?, response: Response<DadosChuck>?) {
                if (response?.code() == 200) {
                    val dadosChuck = response.body()
                    binding.chuckNorri.text = dadosChuck?.value
                }
            }

            override fun onFailure(call: Call<DadosChuck>?, t: Throwable?) {
                Toast.makeText(context, t?.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
