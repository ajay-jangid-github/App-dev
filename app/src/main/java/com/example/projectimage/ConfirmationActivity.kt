package com.example.projectimage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectimage.databinding.ActivityConfirmationBinding

class ConfirmationActivity : AppCompatActivity() {
    private val binding : ActivityConfirmationBinding by lazy{
        ActivityConfirmationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.yesImg.setOnClickListener {
            val intent = Intent(this, AssesmentActivity::class.java)
            startActivity(intent)
        }
        binding.noImg.setOnClickListener {
            val intent = Intent(this, AssesmentActivity::class.java)
            startActivity(intent)
        }

    }



}