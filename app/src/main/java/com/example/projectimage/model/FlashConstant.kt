package com.example.projectimage.model

import com.example.projectimage.Adapter.RvFlashAdapter
import com.example.projectimage.R

object FlashConstant {
    private lateinit var dataList:ArrayList<RvFlashModel>
    fun getData(): ArrayList<RvFlashModel>{
        dataList = ArrayList<RvFlashModel>()
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))
        dataList.add(RvFlashModel("1","pass","1/6","50%"))

        return dataList
    }
}