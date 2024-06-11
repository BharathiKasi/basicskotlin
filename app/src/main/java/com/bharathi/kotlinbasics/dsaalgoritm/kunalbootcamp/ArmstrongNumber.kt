package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow


fun main(){
    val inputScanner = Scanner(System.`in`)
    val number = inputScanner.nextInt()
    println("$number is armstrong number ${checkIsArmStrongNumber(number)}")
}

fun checkIsArmStrongNumber(number: Int): Boolean {
    val length = number.toString().length // this is one way of calculating
    val length2 = floor(log10(number.toDouble())).toInt()+1
    var num = number
    var result = 0
    do {
        val value1  = num/10
        val value2 = num%10
        num = value1
        result += value2.toDouble().pow(length2.toDouble()).toInt()
    }while (num!=0)
    return result==number
}
