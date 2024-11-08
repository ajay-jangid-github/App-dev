package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.projectimage.databinding.ActivityLipsBinding

class LipsActivity : AppCompatActivity() {
    private val binding: ActivityLipsBinding by lazy{
        ActivityLipsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lispsContBtn.setOnClickListener {
            val intent = Intent(this, SoundActivity::class.java)
            startActivity(intent)
        }
        binding.lispUpUpBackArrow.setOnClickListener {
            val intent = Intent(this, AssesmentActivity::class.java)
            startActivity(intent)
        }
        binding.lispNextArrow.setOnClickListener {
            val intent = Intent(this,SoundActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}