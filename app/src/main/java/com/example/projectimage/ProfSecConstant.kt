package com.example.projectimage

import com.example.projectimage.model.RvFlashModel
import com.example.projectimage.model.RvProfSecModel

object ProfSecConstant {
    private lateinit var dataList:ArrayList<RvProfSecModel>
    fun getData(): ArrayList<RvProfSecModel>{
        dataList = ArrayList<RvProfSecModel>()
        dataList.add(RvProfSecModel(R.drawable.rv_eclip1,"farah","samuel","jirah"))
        return dataList
    }

}