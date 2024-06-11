package com.bharathi.kotlinbasics.basics.inline



inline fun <reified T> inlineWithReifiedSample(value:T){
    when(value){
        is String -> {
         println("${value} is String Type")
        }
        is Int ->{
            println("${value} is Int Type")
        }
        is Double ->{
            println("${value} is Double Type")
        }
        else ->{
            println("${value} is Different Type")


        }
    }
}

fun main(){
    inlineWithReifiedSample(100)
    inlineWithReifiedSample(1.00)
    inlineWithReifiedSample("Hai Bharathi")
    inlineWithReifiedSample('a')
}