package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner


class MultiplicationTable{

    companion object{
        fun printMultiplicationTableOfGiveNumber(input:Int){
            for(index in 1..10){
                println("$input*${index} = ${index.times(input)}")
            }
        }
    }
}
fun main(){
    val inputScanner = Scanner(System.`in`)
    println("Enter the number to print mutlication table upto 1 to 10")
    val input = inputScanner.nextInt()
    MultiplicationTable.printMultiplicationTableOfGiveNumber(input)
}