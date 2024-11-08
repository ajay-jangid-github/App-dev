package com.example.projectimage.model

import com.example.projectimage.R

object MemberConstant {

    private lateinit var dataList:ArrayList<RvMembModel>
    fun getData(): ArrayList<RvMembModel> {
        dataList = ArrayList<RvMembModel>()
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        dataList.add(RvMembModel("Sarah", R.drawable.sarah, "Active"))
        return dataList
    }
}