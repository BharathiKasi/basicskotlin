package com.bharathi.kotlinbasics.basics.oops.constructor.secondaryconstructor

class Employee {
    val e_name:String
    var e_id:Int = 0
    val e_role:String
    constructor(name:String, id:Int,role:String){
        this.e_name = name
        this.e_id = id
        this.e_role = role
    }

    fun printEmployeeInfo(){
        println("name is $e_name and id is $e_id and role is $e_role")
    }
}

fun main(){
    val employee = Employee("Bharathi",1000,"Androd Developer")
    employee.printEmployeeInfo()
}