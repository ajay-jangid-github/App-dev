package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.projectimage.databinding.ActivitySelcategoryBinding
import com.example.projectimage.databinding.ActivitySoundBinding

class SoundActivity : AppCompatActivity() {
    private val binding: ActivitySoundBinding by lazy{
        ActivitySoundBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.soundStrtBtn.setOnClickListener {
            val intent = Intent(this,SubscriptionActivity::class.java)
            startActivity(intent)
        }

        binding.upBackArrow.setOnClickListener {
            val intent = Intent(this,LipsActivity::class.java)
            startActivity(intent)
        }
        binding.backArrow.setOnClickListener {
            val intent = Intent(this, LipsActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}