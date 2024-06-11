package com.bharathi.kotlinbasics.basics.oops.classandobjectDemo

open class OuterClassDemo {

    val outerClassProperty = 10
    fun printOuterClassMethod1(){
        println("I am printing outer class method 1")
    }

    fun printOuterClassProperty(){
        println(outerClassProperty)
    }

    class NestedClass{

        val nestedClassProperty = "This is Nested class property"

        fun printNestedClassMethod(){
            println("I am nested class method ")
        }

        fun printNestedClassProperty(a:Int){
            println("I am nested class property ")
        }

        class NestedClass1A{
            val nestedClass1AProperty = "This is Nested class 1A property"

            fun printNestedClass1AMethod(){
                println("I am nested class 1A method ")
            }

            fun printNestedClass1AProperty(a:Int){
                println("I am nested class 1A property ")
            }
        }
    }

    class NestedClass2 {
        val nestedClass2Property = "This is Nested class property"

        fun printNestedClass2Method(){
            println("I am nested class 2 method ")
        }

        fun printNestedClass2Property(a:Int){
            println("I am nested class 2 property ")
        }
    }
}

fun main(args:Array<String>){
    val nestedClass = OuterClassDemo.NestedClass()
    nestedClass.printNestedClassMethod()
    nestedClass.printNestedClassProperty(19)

    val nestedClass2 = OuterClassDemo.NestedClass2()
    nestedClass2.printNestedClass2Method()
    nestedClass2.printNestedClass2Property(199)

    val nestedClass1A = OuterClassDemo.NestedClass.NestedClass1A()
}