package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Scanner
import kotlin.math.pow


fun main(){
    val inputScanner = Scanner(System.`in`)
    println("Enter the radius to find the area of circle")
    val radius = inputScanner.nextDouble()
    println("Area of circle radiur ${radius} is ${findAreadOfCircle(radius)}")
}

fun findAreadOfCircle(radius:Double):Double{
    return 3.14 * radius.pow(2).toInt()
}