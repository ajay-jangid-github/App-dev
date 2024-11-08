package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.Adapter.RvFlashAdapter
import com.example.projectimage.databinding.ActivityFlashCardsBinding
import com.example.projectimage.model.FlashConstant

class FlashCardsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var rvFlashAdapter : RvFlashAdapter
    private val binding: ActivityFlashCardsBinding by lazy {
        ActivityFlashCardsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.flashTBtn.setOnClickListener {
            val intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }

      rvFlashAdapter= RvFlashAdapter(FlashConstant.getData(),this)
        binding.rvFlash.layoutManager = LinearLayoutManager(this)
        binding.rvFlash.adapter = rvFlashAdapter

    }
}