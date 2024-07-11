package com.bharathi.kotlinbasics.dsaalgoritm.sorting




fun main(){

    val array = arrayOf(10,1000,999,898,797,500,1,5,0)
     getMeAscendingOrderSortedArray(array).map {
         print("${it} ")
     }
}

/**
 * Slectection sort algorithm is n times iterate.
 * for example: here the array size is 9 so we have to iterate 9 times.
 */

fun getMeAscendingOrderSortedArray(array: Array<Int>): Array<Int> {

    return array
}
