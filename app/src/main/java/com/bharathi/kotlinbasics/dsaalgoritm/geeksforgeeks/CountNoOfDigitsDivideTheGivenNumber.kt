package com.bharathi.kotlinbasics.dsaalgoritm.geeksforgeeks

import java.util.Scanner


fun main(){
    println("Please enter the number")
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val result = getNoOfDigitsDividesTheInput(input,0)
    println("${result} can divide the ${input}")
}

private fun getNoOfDigitsDividesTheInput(input:Int,result:Int):Int{
    var count = 0
    var i = input
    do{
        val lastDigit = i%10
         i = i/10
        if(lastDigit>0){
            if(input%lastDigit == 0){
                count++
            }
        }
    }while(i>0)
    return count
}