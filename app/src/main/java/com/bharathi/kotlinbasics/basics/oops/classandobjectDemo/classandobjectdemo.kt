package com.bharathi.kotlinbasics.basics.oops.classandobjectDemo



class Person{

     var age:String = ""

    fun test(){
        var a :Int
        a = 10
        println(a)
    }

}


fun main(){
    val person = Person()
    person.test()
    person.age
}