package com.bharathi.kotlinbasics.basics.oops.constructor.secondaryconstructor

import com.bharathi.kotlinbasics.basics.accessModifier.InternalModifierDemo

class Person3(name:String) {

    init {
        println("primary constructor init block execution")
        println(name)
    }
    constructor(name: String,id:Int,address:String) : this(name){
        println("secondary constructor with 3 parameter")
        println("$id and $address")
    }
}

fun main(){
     Person3("Bharathi",234234,"chennai")

}