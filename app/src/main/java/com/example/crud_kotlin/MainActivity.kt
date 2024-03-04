package com.example.crud_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.crud_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val login = intent.getStringExtra("login")
        binding.etHello.text = "Привет $login"
    }
}