package com.bharathi.kotlinbasics.basics.oops.interfaceDemo

 interface Interface1 {
     fun printSomething()
}

interface  Interface2{
    fun printSomething()
}

class DemoClass : Interface1,Interface2{

    override fun printSomething() {
        println("This is abstract method from both Interface 1 and Interface 2")
    }
}

fun main(){
    val demoClass = DemoClass()
    demoClass.printSomething()
}