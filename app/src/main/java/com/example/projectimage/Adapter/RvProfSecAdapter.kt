package com.example.projectimage.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.databinding.RvProfileMe2ItemBinding
import com.example.projectimage.model.RvProfSecModel

class RvProfSecAdapter(var dataList:ArrayList<RvProfSecModel>,
                var context: Context):RecyclerView.Adapter<RvProfSecAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        /*  var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
           return MyViewHolder(view)*/
        var binding = RvProfileMe2ItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.p2Img.setImageResource(dataList[position].image)
        holder.binding.prActivity2HTxt.text = dataList[position].fName
        holder.binding.prActivity2SubTxt.text = dataList[position].sSecond
        holder.binding.prActivity2FinalTxt.text = dataList[position].thName

    }

    inner class MyViewHolder(var binding: RvProfileMe2ItemBinding): RecyclerView.ViewHolder(binding.root)

}