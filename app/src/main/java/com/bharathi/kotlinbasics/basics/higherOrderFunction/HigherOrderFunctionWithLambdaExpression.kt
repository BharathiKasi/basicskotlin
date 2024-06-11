package com.bharathi.kotlinbasics.basics.higherOrderFunction

class HigherOrderFunctionWithLambdaExpression {

    val lambda1: (Int,Int)-> Int = { a,b ->
        a and b
    }

    fun higherOrderFunction(addOfTwoNumber:(Int,Int) -> Int, randomString: String){
        val result = addOfTwoNumber(10,20)
        println(result)
        println(randomString)

    }
}


fun main(args : Array<String>){
    val instance = HigherOrderFunctionWithLambdaExpression()
    instance.higherOrderFunction(instance.lambda1,"12341234")


}