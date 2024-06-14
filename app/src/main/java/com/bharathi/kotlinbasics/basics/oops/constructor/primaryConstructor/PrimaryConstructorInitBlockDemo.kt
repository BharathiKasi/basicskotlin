package com.bharathi.kotlinbasics.basics.oops.constructor.primaryConstructor

class Employee (name:String,id:Int,role:String) {
    private val e_name:String
    private var e_id:Int = 0
   private val e_role:String

    init {
        e_name = name
        e_id = id
        e_role = role
    }

       fun printEmployeeInfo(){
        println("name is ${e_name} id is ${e_id}  and role is ${e_role}")
    }
}

fun main(){
    val employee = Employee("Bharathi", id = 2000, role = "Android Developer")
    employee.printEmployeeInfo()
}