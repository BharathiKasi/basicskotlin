package com.bharathi.kotlinbasics.basics.collections.mutablecollection.list

fun main(){

    val mutableList = mutableListOf<Any>(12,3,4,5,6,)
    val mList = MutableList(5){0}
    mutableList.add(100)
    mutableList.add("Bharathi")
    println(mList)
}