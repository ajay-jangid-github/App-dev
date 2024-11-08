package com.example.projectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.Adapter.RvAdapter
import com.example.projectimage.databinding.ActivityAgeBinding
import com.example.projectimage.databinding.ActivityTipsBinding

class TipsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var rvAdapter: RvAdapter
    private val binding: ActivityTipsBinding by lazy {
        ActivityTipsBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.watchButton.setOnClickListener {
            val intent = Intent(this, ComingSoonActivity::class.java)
            startActivity(intent)
        }


        rvAdapter = RvAdapter(Constant.getData(),this)
        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = rvAdapter

    }
}