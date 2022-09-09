package com.reyhan.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.reyhan.firebaseauth.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private var _binding: ActivitySignUpBinding? = null
    private val binding get() = _binding as ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
        binding.btnSignUp.setOnClickListener {
            val email = binding.etEmailSignUp.text.toString().trim()
            val pass = binding.etPasswordSignUp.text.toString().trim()
            val confirmPass = binding.etConfirmPasswordSignUp.text.toString().trim()

            if (checkValidation(email, pass, confirmPass))
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.tbSignUp.setNavigationOnClickListener {
            finish()
        }

    }

    private fun checkValidation(email: String, pass: String, confirmPass: String): Boolean {
        if (email.isEmpty()){
            binding.etEmailSignUp.error = "Please field your email"
            binding.etEmailSignUp.requestFocus()
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.etEmailSignUp.error = "Please use valid email"
            binding.etEmailSignUp.requestFocus()
        } else if (pass.isEmpty()){
            binding.etPasswordSignUp.error = "Please field your password"
            binding.etPasswordSignUp.requestFocus()
        } else if (confirmPass.isEmpty()){
            binding.etConfirmPasswordSignUp.error = "Please field your confirm"
            binding.etConfirmPasswordSignUp.requestFocus()
        } else return true
        return false
    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbSignUp)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}