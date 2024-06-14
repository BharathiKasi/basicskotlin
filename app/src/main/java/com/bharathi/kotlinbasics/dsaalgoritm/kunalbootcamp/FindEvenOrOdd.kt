package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner


fun main(){
    val inputStream = Scanner(System.`in`)
    val input = inputStream.nextInt()
    if(input%2 == 0){
        println("$input is even number")
    }else {
        println("$input is odd number")
    }
}