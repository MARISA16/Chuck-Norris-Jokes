package com.marisa.chucknorrisjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
     var cluck = String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            click()
        }
    }
}
private fun click(){
    if (chuck){