package com.reyhan.firebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reyhan.firebaseauth.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private var _binding: ActivitySignInBinding? = null
    private val binding get() = _binding as ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbSignIn)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

    }
}