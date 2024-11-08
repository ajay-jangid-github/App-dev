package com.example.projectimage.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.databinding.RvFlashItemBinding
import com.example.projectimage.databinding.RvMemberItemBinding
import com.example.projectimage.model.RvFlashModel
import com.example.projectimage.model.RvMembModel

class RvMembAdapter(
     var dataList: ArrayList<RvMembModel>,
    var context: Context):RecyclerView.Adapter<RvMembAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvMembAdapter.MyViewHolder {
        /*  var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
           return MyViewHolder(view)*/
        var binding = RvMemberItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.sarhTxt.text = dataList[position].remname
        holder.binding.sarhImg.setImageResource(dataList[position].remimg)
        holder.binding.sarahActiveTxt.text = dataList[position].status

    }

    inner class MyViewHolder(var binding: RvMemberItemBinding): RecyclerView.ViewHolder(binding.root)

}