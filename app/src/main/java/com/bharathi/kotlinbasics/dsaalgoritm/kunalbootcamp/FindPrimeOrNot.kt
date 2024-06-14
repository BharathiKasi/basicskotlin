package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner


class FindPrimeOrNot{

    companion object{
        fun checkTheGivenNumberIsPrimeOrNot(number:Int):Boolean{
            var result = true
            if(number<=1){
                return false
            }
            var i =2
            while(i<number){
                if(number%i == 0){
                    result = false
                    break
                }
                i++
            }
            return result
        }
    }
}

fun main(){
    println("Enter the number")
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    println( "${input} is prime? "+FindPrimeOrNot.checkTheGivenNumberIsPrimeOrNot(input))

}