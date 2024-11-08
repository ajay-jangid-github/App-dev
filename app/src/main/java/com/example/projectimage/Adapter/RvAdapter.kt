package com.example.projectimage.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.projectimage.databinding.RvItemBinding
import com.example.projectimage.model.RvModel

class RvAdapter(var dataList:ArrayList<RvModel>,
                var context: Context):RecyclerView.Adapter<RvAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
     /*  var view = LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false)
        return MyViewHolder(view)*/
        var binding = RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return  dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.txtId1.text = dataList[position].id.toString()
        holder.binding.profile1.setImageResource(dataList[position].profile)
        holder.binding.tipTxt1.text = dataList[position].tipsTxt
        holder.binding.tipDescTxt1.text = dataList[position].tipsDesc
        holder.itemView.setOnClickListener {
            Toast.makeText(context,dataList[position].id,Toast.LENGTH_LONG) .show()
        }
    }

    inner class MyViewHolder(var binding: RvItemBinding): RecyclerView.ViewHolder(binding.root)

}