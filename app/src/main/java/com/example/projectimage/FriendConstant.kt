package com.example.projectimage

import com.example.projectimage.model.RvFriModel

object FriendConstant {
    private lateinit var dataList:ArrayList<RvFriModel>
    fun getData(): ArrayList<RvFriModel>{
        dataList = ArrayList<RvFriModel>()
        dataList.add(RvFriModel("4",R.drawable.sam_img,"Samuel"))
        dataList.add(RvFriModel("5",R.drawable.rebecca,"Rebecca"))
        dataList.add(RvFriModel("6",R.drawable.david,"David"))
        dataList.add(RvFriModel("7",R.drawable.jackson,"Jackson"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        dataList.add(RvFriModel("8",R.drawable.chris,"Chris"))
        return dataList
    }

}