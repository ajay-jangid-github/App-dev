package com.example.projectimage

import com.example.projectimage.model.RvModel

object Constant {
    private lateinit var dataList:ArrayList<RvModel>
    fun getData(): ArrayList<RvModel>{
        dataList = ArrayList<RvModel>()
        dataList.add(RvModel(1,R.drawable.tips_circle1,"Keep your tongue back","tip_desc_txt1"))
        dataList.add(RvModel(2,R.drawable.tips_circle1,"Keep your tongue back","tip_desc_txt2"))
        dataList.add(RvModel(3,R.drawable.tips_circle1,"Keep your tongue back","tip_desc_txt3"))
        dataList.add(RvModel(4,R.drawable.tips_circle1,"Keep your tongue back","tip_desc_txt4"))
        return dataList
    }

}