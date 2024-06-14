package com.bharathi.kotlinbasics.dsaalgoritm.recursion

import java.util.Scanner


fun main(){
    printNumberTo1UsingRecursion()
}


private fun printNumberTo1UsingRecursion(){

    val scanner = Scanner(System.`in`)
    println("Enter the max number you want to start")
    val num = scanner.nextInt()
    printNum(num)



}

private fun printNum(num:Int){
    if(num<1) return

    println(num)
    printNum(num-1)
}

