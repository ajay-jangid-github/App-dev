package com.example.projectimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectimage.databinding.ActivityScreenBinding

class screenActivity : AppCompatActivity() {
    private val binding: ActivityScreenBinding by lazy{
        ActivityScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}