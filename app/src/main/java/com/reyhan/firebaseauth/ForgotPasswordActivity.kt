package com.reyhan.firebaseauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        binding.btnSendEmail.setOnClickListener {
            Toast.makeText(this, "Send Email", Toast.LENGTH_LONG).show()
        }

        binding.tbForgotPass.setNavigationOnClickListener {
            finish()
        }

    }

    private fun initActionBar() {
        setSupportActionBar(binding.tbForgotPass)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}