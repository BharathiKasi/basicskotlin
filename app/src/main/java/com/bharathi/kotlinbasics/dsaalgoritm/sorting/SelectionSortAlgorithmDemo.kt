package com.bharathi.kotlinbasics.dsaalgoritm.sorting


fun main(){

    val array = arrayOf(10,1000,999,898,797,500,1,5,0)
    getMeAscendingOrderSortedArray(array).forEach {
     println(it)
    }
}

fun getMeAscendingOrderSortedArray(array: Array<Int>): Array<Int> {

    for (index1 in array.indices){
        for(index2 in index1 until  array.size){
            if(array[index2]<array[index1]){
                array[index1] = array[index1] + array[index2]
                array[index2] = array[index1] - array[index2]
                array[index1] = array[index1] - array[index2]
            }
        }
    }
    return array
}
