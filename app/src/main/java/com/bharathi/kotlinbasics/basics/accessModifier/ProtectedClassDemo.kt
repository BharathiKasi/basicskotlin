package com.bharathi.kotlinbasics.basics.accessModifier

 open class ProtectedClassDemo {

     open protected val string:String = "test"
   protected open fun printProtectClassPrintStatement(){
        println("this is protected class print statement")
    }
}

class Class2 : ProtectedClassDemo(){

    fun printSubClassPrintStatment(){
        println("this is sub class print statement")
        printProtectClassPrintStatement()
    }

    override val string: String
        get() = "okokokok"

     override  fun printProtectClassPrintStatement() {
         println(string)
         println(super.string)

         super.printProtectClassPrintStatement()
        println("this is override method from parent class")
    }


}

fun main(){
    Class2().printSubClassPrintStatment()
}