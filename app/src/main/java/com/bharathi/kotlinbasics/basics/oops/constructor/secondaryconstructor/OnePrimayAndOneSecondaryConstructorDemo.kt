package com.bharathi.kotlinbasics.basics.oops.constructor.secondaryconstructor

class Person2(name:String) {

    init {
        println("primary constructor init block $name")
    }
    constructor(id:Int,address:String,name:String): this(name){
        println("secondary constructor with 3 parameter")
        println("$id and $address")
    }
}

fun main(){
    Person2(1000,"chennai","bharathi")

}