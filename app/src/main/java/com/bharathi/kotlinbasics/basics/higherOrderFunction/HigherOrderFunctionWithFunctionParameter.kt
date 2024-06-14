package com.bharathi.kotlinbasics.basics.higherOrderFunction

class HigherOrderFunctionWithFunctionParameter {

    fun function1() {
        println("Hi this is function 1")
    }


    fun higherOrderFunction(lambda: (Int, Int) -> Unit, function1: () -> Unit) {
        lambda(20, 30)
        function1()
    }
}


fun main() {
    val instance = HigherOrderFunctionWithFunctionParameter()
    instance.higherOrderFunction(
        lambda = { a, b -> println(a.plus(b)) },
        function1 = instance::function1  //:: this will create a reference of function or property...

    )
}