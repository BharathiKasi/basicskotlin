package com.bharathi.kotlinbasics.basics.inline


fun <T> regularGenericsFunction(value: T){
    when(value){
        is String ->{
          println("This is you string ${value}")
        }
        is Int ->{
            println("This is you Int ${value}")

        }
        is Float -> {
            println("This is you Float ${value}")

        }
        is Double -> {
            println("This is you Double ${value}")

        }
    }
}

fun main(){
    regularGenericsFunction(value = 100)
    regularGenericsFunction(value = "Hai Bharathi")
}