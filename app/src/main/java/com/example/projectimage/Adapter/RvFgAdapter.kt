package com.example.projectimage.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.databinding.RvFrndGrpItemBinding
import com.example.projectimage.model.RvFriModel

class RvFgAdapter(
    var dataList: ArrayList<RvFriModel>,
    var context: Context):RecyclerView.Adapter<RvFgAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvFgAdapter.MyViewHolder {
        /*  var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
           return MyViewHolder(view)*/
        var binding = RvFrndGrpItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.txtFrdId1.text = dataList[position].id.toString()
        holder.binding.samImg.setImageResource(dataList[position].img)
        holder.binding.samName.text = dataList[position].name
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }


    inner class MyViewHolder(var binding: RvFrndGrpItemBinding): RecyclerView.ViewHolder(binding.root)

}