package com.example.projectimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.Adapter.RvProfSecAdapter
import com.example.projectimage.databinding.ActivityProfileMeSecondBinding

class ProfileMeSecondActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var RvProfSecAdapter:RvProfSecAdapter
    private val binding: ActivityProfileMeSecondBinding by lazy {
        ActivityProfileMeSecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        RvProfSecAdapter = RvProfSecAdapter(ProfSecConstant.getData(),this)
        binding.rvProfSec.layoutManager = LinearLayoutManager(this)
        binding.rvProfSec.adapter = RvProfSecAdapter

    }
}