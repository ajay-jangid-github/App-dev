package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectimage.databinding.ActivityJamesBinding
import com.example.projectimage.databinding.ActivitySignInBinding

class JamesActivity : AppCompatActivity() {
    private val binding : ActivityJamesBinding by lazy {
        ActivityJamesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.editGoals.setOnClickListener {
            val intent = Intent(this, FlashCardsActivity::class.java)
            startActivity(intent)
        }

    }
}