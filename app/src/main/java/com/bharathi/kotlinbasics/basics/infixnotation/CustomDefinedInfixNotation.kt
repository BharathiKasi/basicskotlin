package com.bharathi.kotlinbasics.basics.infixnotation

fun main(args: Array<String>){
val instance = CustomDefinedInfixNotation()
    val result  = instance square 100

    println(result)
}

class CustomDefinedInfixNotation{
    infix fun square(n:Int):Int{

        return n*n
    }
}