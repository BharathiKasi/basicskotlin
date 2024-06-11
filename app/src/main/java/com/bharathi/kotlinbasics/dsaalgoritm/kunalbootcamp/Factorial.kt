package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner

fun main(){
    val inputStream = Scanner(System.`in`)
    println("Enter the number to find factorial")
    val number = inputStream.nextInt()
    val result = findFactorial(number,1)
    println("$number factorial is $result")
}

fun findFactorial(number: Int,x:Int): Int {
    if(number==0){
        return x
    }
    if(number==1){
        return x
    }
    return  findFactorial(number-1,number*x)
}
