package com.example.projectimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.projectimage.Adapter.RvFgAdapter
import com.example.projectimage.Adapter.RvMembAdapter
import com.example.projectimage.databinding.ActivityGroupBinding
import com.example.projectimage.model.MemberConstant



class GroupActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var rvFgAdapter: RvFgAdapter
    private lateinit var rvMembAdapter: RvMembAdapter
    private val binding: ActivityGroupBinding by lazy {
        ActivityGroupBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        rvFgAdapter = RvFgAdapter(FriendConstant.getData(),this)
        binding.rvFriendGrpItem.layoutManager = LinearLayoutManager(this)
        binding.rvFriendGrpItem.adapter = rvFgAdapter

        rvMembAdapter = RvMembAdapter(MemberConstant.getData(),this)
        binding.rvGroup.layoutManager = LinearLayoutManager(this)
        binding.rvGroup.adapter = rvMembAdapter

    }

}