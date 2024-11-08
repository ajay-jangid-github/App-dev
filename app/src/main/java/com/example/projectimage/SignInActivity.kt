package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.projectimage.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

@Suppress("DEPRECATION")
class SignInActivity : AppCompatActivity() {

    private val binding : ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.signintxt.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


        binding.signInBtn.setOnClickListener {
            val intent = Intent(this,MainIndicaterActivity::class.java)
            startActivity(intent)
        }

    }



}