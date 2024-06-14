package com.bharathi.kotlinbasics.basics.oops.classandobjectDemo

class OuterDemoClass {

    private val outerProperty = 1000

    val outerProperty2 = 100

    private fun printOuterPropertyMemberFunction(){
        println("show outer property member function")
    }
    inner class InnerClassDemo{
        private var innerPropery1 = "Hello Inner Class"

        fun printInnerClassMethod(){
            println("This is inner class method.")
        }

        fun doAccessOuterClassProperty(){
            println("this is outer class property value ${outerProperty}")
        }

        fun doCallOuterClassMemberFunction(){
            printOuterPropertyMemberFunction()
        }

        inner  class InnerClass1A{
            fun printOuterProperty(){
                println(outerProperty)
            }
        }
    }
}

fun main(){
    val innerClassDemo = OuterDemoClass().InnerClassDemo()
    innerClassDemo.printInnerClassMethod()

    innerClassDemo.doAccessOuterClassProperty()
    innerClassDemo.doCallOuterClassMemberFunction()

    val outerDemoClass = OuterDemoClass()
    println("print outer property 2 value " +outerDemoClass.outerProperty2)

    val innerClass1A = OuterDemoClass().InnerClassDemo().InnerClass1A()
    innerClass1A.printOuterProperty()


}