package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner


fun main(){
    val inputStream = Scanner(System.`in`)
    val input = inputStream.nextInt()
    val result = findFibonacciUsingRecursiveApproach(input)
    println("fibonacci of $input is $result")
}

fun findFibonacci(input: Int): List<Int> {
    if(input==0){
        return emptyList()
    }
    if(input ==1){
        return listOf(0)
    }
    val arrayList = ArrayList<Int>(2)
    arrayList.add(0)
    arrayList.add(1)
    for(value in 2 until input){
        arrayList.add(arrayList[value-1] + arrayList[value-2])
    }
    return arrayList
}

fun findFibonacciUsingRecursiveApproach(input: Int):Int{
    if (input ==0){
        return 0
    }
    if (input ==1){
        return 1
    }
    return findFibonacciUsingRecursiveApproach(input-1)+ findFibonacciUsingRecursiveApproach(input-2)
}
