package com.bharathi.kotlinbasics.basics

import android.util.Log

val TAG = "KotlinFeatures"

fun main(){
    //concise Sample
    val consiceSample = ConciseSample(name = "Bharathi Priyanka", age = 27)
    Log.d(TAG, "${consiceSample.age} and ${consiceSample.name}")

    //Null Safety
    var a:Int? = null
    println(a?.plus(10))

    //extension function
    val instance = A()
    instance.test1()
    instance.test2()


    //smart cast

    getParamType("Bharathi")
    getParamType(100)
    getParamType(10f)
    getParamType(false)

}

fun getParamType(smartCast:Any){
    when(smartCast){
        is Int ->{
            smartCast.and(100)
            println("it is a Integer type")
        }
        is Float ->{
            smartCast.plus(10000)
            println("it is a Long type")
        }
        is String ->{
            smartCast.plus(" Welcome")
            println("it is a String type")
        }
        else ->{
            println("it is a Unknow type")
        }

    }
}

data class ConciseSample(val name:String,val age:Int)

class A {
    fun test1(){
        println("test1 function")
    }
}

fun A.test2(){
    println("test2 function")
}