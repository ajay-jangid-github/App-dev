package com.example.projectimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectimage.databinding.ActivityProfileBinding
import com.example.projectimage.databinding.ActivityProfilemeBinding

class ProfilemeActivity : AppCompatActivity() {
    private val binding: ActivityProfilemeBinding by lazy {
        ActivityProfilemeBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}