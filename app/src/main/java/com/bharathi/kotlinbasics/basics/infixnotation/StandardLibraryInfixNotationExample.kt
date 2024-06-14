package com.bharathi.kotlinbasics.basics.infixnotation


fun main(arga: Array<String>){
    demoAndOperator()
}


fun  demoAndOperator(){
    val a = 100
    val b = 200
    val result1 = a.and(b)  // doing and operation without infix notation operation
    println("without infix add operation ${result1}")
    val result2 = a and b  // doing and operation with infox notation operation
    println("with infix add operation ${result2}")
    val result3 = a.or(b)
    println("without infix or operation ${result3}")
    val result4 = a or b
    println("with infix or operation ${result4}")

}