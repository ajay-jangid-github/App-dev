package com.example.projectimage.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.databinding.RvFlashItemBinding
import com.example.projectimage.model.RvFlashModel

class RvFlashAdapter(
    var dataList: ArrayList<RvFlashModel>,
    var context: Context):RecyclerView.Adapter<RvFlashAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvFlashAdapter.MyViewHolder {
        /*  var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
           return MyViewHolder(view)*/
        var binding = RvFlashItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.txtId1.text = dataList[position].id.toString()
        holder.binding.wordName.text = dataList[position].wname
        holder.binding.accNo.text = dataList[position].acuData
        holder.binding.preNo.text = dataList[position].perData
    }

    inner class MyViewHolder(var binding: RvFlashItemBinding): RecyclerView.ViewHolder(binding.root)

}