package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectimage.databinding.ActivityAgeBinding
import com.example.projectimage.databinding.ActivityComingSoonBinding

class ComingSoonActivity : AppCompatActivity() {
    private val binding :ActivityComingSoonBinding by lazy {
        ActivityComingSoonBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.comingSoonCancel.setOnClickListener {
            val intent = Intent(this, ComingSoonActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}