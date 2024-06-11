package com.bharathi.kotlinbasics.basics.generic

import java.util.LinkedList

class  Person<T>(private val name:String, private val age:T,private val occupation:T,private val gender:T) {

    fun printName(){
        println("Your name is $name")
    }
    fun printAge(){
        when(age){
            is Int ->{
                println("your age is type of Int type")
            }
        }
        println("Your age is $age")
    }

    fun printOccupation(){
        println("Your occupation is $occupation")
    }
    fun printGender(){
        println("Your gender is $gender")
    }

}

fun main(){
    val person = Person("Bharathi",20,"coolie",'M')
    person.printName()
    person.printAge()
    person.printOccupation()
    person.printGender()
}