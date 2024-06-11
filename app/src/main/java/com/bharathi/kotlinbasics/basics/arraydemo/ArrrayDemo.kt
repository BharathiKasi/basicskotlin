package com.bharathi.kotlinbasics.basics.arraydemo

import com.bharathi.kotlinbasics.basics.accessModifier.Class2
import com.bharathi.kotlinbasics.basics.accessModifier.ProtectedClassDemo

fun main() {
    arrayCreationUsingArrayOf()
    println("----------------------------------")
    arrayCreationUsingArrayClass()

}

fun arrayCreationUsingArrayOf() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("old  0 index value ${array[0]}")
    println("setting 0 index value to 100")
    println("new 0 index value is ${array.get(0)}")

    println("printing values using for loop")
    for (value in array) {
        println(value)
    }
    println("printing values using indices")
    for (index in array.indices) {
        println(index)
    }
    println("printing values using value with index")
    for ((value, index) in array.withIndex()) {
        println("index is ${index} and value is ${value}")
    }
}

fun arrayCreationUsingArrayClass(){

    val array = Array(5) { i -> 0 }
    array[0] = 100

    for (value in array){
        println(value)
    }
}