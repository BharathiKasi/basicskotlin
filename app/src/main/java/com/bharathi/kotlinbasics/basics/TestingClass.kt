package com.bharathi.kotlinbasics.basics

import kotlin.collections.ArrayList


fun main(){
    val larray = intArrayOf(8,1,2,2,3)
    println(larray.getSortedArray(larray))
    val ll = ArrayList<Int>(larray.size)
    ll.toArray()
}


fun IntArray.getSortedArray(array:IntArray):IntArray{
    val sortedArray = IntArray(array.size,{-1})
    var lessValue = 0
    for((index,value) in array.withIndex()){
        for(value2 in 0 until array.size-1){
            if(array[value2]<value){
                lessValue+=1
            }
        }
        sortedArray[index] = lessValue
        lessValue = 0
    }
    return sortedArray
}