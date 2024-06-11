package com.bharathi.kotlinbasics.basics.extensiondemo

class ExtensionFunctionDemo {
    private val a = 10
    val b = 20

    fun test(){
        println("This is normal method...")
    }
}

fun ExtensionFunctionDemo.printSomething(){
    println(this.b)
    println(this.test())
}