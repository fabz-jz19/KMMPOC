package com.example.demokmp.android

import android.app.Activity
import android.os.Bundle
import com.example.demokmp.Greeting
import com.example.demokmp.android.databinding.ActivityMainBinding


/**
 * @author Noellette Jeremie Fabien
 */
class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        updateUI()
    }

    private fun updateUI(){
        binding.header.text = Greeting().greet()
    }
}