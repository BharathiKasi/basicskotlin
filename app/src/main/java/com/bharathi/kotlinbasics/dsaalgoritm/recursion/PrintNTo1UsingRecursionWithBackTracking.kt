package com.bharathi.kotlinbasics.dsaalgoritm.recursion

import java.util.Scanner


fun main(){
    printNto1UsingRecursionWithBackTrackingMechanism()
}

private fun printNto1UsingRecursionWithBackTrackingMechanism(){
    val scanner = Scanner(System.`in`)
    println("Enter the number")
    val num = scanner.nextInt()
    printNumByBackTracking(1,num)
}

fun printNumByBackTracking(num: Int, num1: Int) {
    if(num>num1) return
    printNumByBackTracking(num+1,num1)
    println(num)
}
