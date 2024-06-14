package com.bharathi.kotlinbasics.basics.oops.inheritance

open class Employee(name:String,age:Int,salary:Float,val address:String) {

    init {
        println("Employee Name is $name and age is $age and salary is $salary")
    }

    inline fun printAddress(){
        println("addreess is $address")
    }

}

class WebDeveloper(name:String, age:Int, salary:Float,address:String): Employee(name, age, salary, address){

    inline fun printTitle(){
        println("Web Developer")
    }

    fun printShift(){
        println("Night Shift")
    }
}

class IosbDeveloper(name:String, age:Int, salary:Float,address:String): Employee(name, age, salary, address){

    inline fun printTitle(){
        println("Ios Developer")
    }

    fun printShift(){
        println("Day Shift")
    }
}

class AndroidDeveloper(name:String, age:Int, salary:Float,address:String): Employee(name, age, salary, address){

    inline fun printTitle(){
        println("Android Developer")
    }

    fun printShift(){
        println("Day and Night Shift")
    }
}

fun main(){
    val webDeveloper = WebDeveloper("Arularasan",38,9873242.23F, address = "Chennai")

    webDeveloper.printTitle()
    webDeveloper.printAddress()
    webDeveloper.printShift()

    val iosDeveloper = IosbDeveloper("Gubendhiran",30,9873242.23F, address = "Theni")
    iosDeveloper.printTitle()
    iosDeveloper.printAddress()
    iosDeveloper.printShift()

    val androidDeveloper = AndroidDeveloper("Bharathi",28,9873242.23F, address = "Chennai")
    androidDeveloper.printTitle()
    androidDeveloper.printAddress()
    androidDeveloper.printShift()

}