package com.bharathi.kotlinbasics.basics.controlflow

private val TAG = "WhenExpressionSample"

fun main(args:Array<String>){
    whenWithoutExpression(20)
    whenWithoutExpression(200)
}



fun whenExpressionWithSmarCast(value:Any){
    when(value){
        is Int ->{
            val result = value.plus(10)
            println(result)
        }
        is String ->{
            val result = "${value} Mr. A.P.J. Abdul Kalam Sir"
            println(result)
        }

        is Float ->{
            val result = value.plus(10f)
            println(result)
        }
    }
}
fun whenWithoutExpression(value:Int){
    when{
        value in 1..10 -> {
            println("valud is with in the range 1 to 10")
        }
        value in 11..20 ->{
            println("valud is with in the range 11 to 20")
        }
        else ->{
            println("invalid in input")
        }
    }
}








fun whenExpressionDemo1(value:Int){
    when(value){
        1 -> println("One")
        2 -> println("Two")
        in 1..100 -> {

        }
        else -> println("Invalid Number")
    }
}

fun showwhenBlockWithoutExpression(value:Int){

    when{
        value < 0  ->{
            println("Given value is less than 0")
        }

        value < 10  ->{
            println("Given value is less than 10")
        }

        value in 0..100 ->{
            println("Given value is in the range of 0 to 100")
        }
    }

}

fun nestedIfExpression(value:Int){
    if(value > 100 && value <500){
        if(value > 200){
          println("Given data is greater than 200")
        } else {
            println("Given data is less than 200")
        }
    }else {

    }
}

