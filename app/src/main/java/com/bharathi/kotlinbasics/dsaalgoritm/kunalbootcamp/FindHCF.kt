package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner


fun findHCF(a:Int,b:Int):Int{
    var num1 = a
    var num2 = b
    while (num2!=0){
        val temp = num2
        num2 = num1 %num2
        num1 = temp
    }
    return num1
}

fun main(){
    val inputScanner = Scanner(System.`in`)
    println("enter the first number")
    val num1 = inputScanner.nextInt()
    println("enter the second number")
    val num2 = inputScanner.nextInt()
    println("the HCF of $num1 and $num2 is ${findHCF(num1,num2)}")
}