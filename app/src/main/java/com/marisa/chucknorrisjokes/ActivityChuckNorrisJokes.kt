package com.marisa.chucknorrisjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Toast
import com.marisa.chucknorrisjokes.databinding.ActivityChuckNorrisJokesBinding
import com.marisa.chucknorrisjokes.models.DadosChuck
import com.marisa.chucknorrisjokes.repositories.Repository
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class ActivityChuckNorrisJokes : AppCompatActivity() {

    private lateinit var binding: ActivityChuckNorrisJokesBinding

    val repository = Repository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chuck_norris_jokes)
        binding = ActivityChuckNorrisJokesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            click()
        }
    }


    private fun click() {

        val result =repository.getChuck()

        result.enqueue( object : Callback<DadosChuck> {
            override fun onResponse(call: Call<DadosChuck>?, response: Response<DadosChuck>?) {
                if (response?.code() == 200) {
                    var responseBody = response.body()!!
                    var textView = textView()
                    textView.text = responseBody.value
                }
            }

            override fun onFailure(call: Call<DadosChuck>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }
        })



    }
}