package com.bharathi.kotlinbasics.dsaalgoritm.geeksforgeeks

import kotlin.math.absoluteValue

fun main(){
   println(reverse(-2147483648)  )
}

fun reverse(x: Int): Int {
    var isNegative = x<0
    var input = if(isNegative) x.absoluteValue else x
    var result = 0L
    do{
        val reminder = input%10
        input = input/10
        result = (result*10) + reminder
        if(result< Math.pow(-2.0,31.0) || result> Math.pow(2.0,31.0)) {
            result = 0
            break
        }
    }while(input!=0)
    return if(isNegative) (result * -1).toInt() else result.toInt()
}