package com.bharathi.kotlinbasics.basics.oops.constructor.primaryConstructor

class Person(val name:String,val id:Int) {

    inline fun printName(){
        println(name)
        println(id)
    }

    fun printParentNameAndid(name:String,id:Int){
        println("parent is ${name} and $id")
    }

}

fun main(array: Array<String>){
    val person = Person("Bharathi",1000)
    person.printName()
    person.printParentNameAndid("Sulochana",2000)
}