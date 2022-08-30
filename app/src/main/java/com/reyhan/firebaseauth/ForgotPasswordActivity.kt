package com.reyhan.firebaseauth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reyhan.firebaseauth.databinding.ActivityForgotPasswordBinding
import com.reyhan.firebaseauth.databinding.ActivitySignInBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private var _binding: ActivityForgotPasswordBinding? = null
    private val binding get() = _binding as ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbForgotPass)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}