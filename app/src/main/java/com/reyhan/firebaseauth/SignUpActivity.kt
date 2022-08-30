package com.reyhan.firebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reyhan.firebaseauth.databinding.ActivitySignInBinding
import com.reyhan.firebaseauth.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private var _binding: ActivitySignUpBinding? = null
    private val binding get() = _binding as ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbSignUp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}