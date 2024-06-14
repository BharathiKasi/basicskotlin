package com.bharathi.kotlinbasics.basics.oops.constructor.secondaryconstructor

open class Company(name:String) {

    init {
        println("primary constructor init block of company class")
        println("$name")
    }

    constructor(name: String,companyid:Int,address:String):this(name){
        println("secondary constructor with 3 parameter")
        println("$companyid and $address")
    }
}

class Employee2(empName:String,cmpName:String ) : Company(cmpName){

    init {
        println("primary constructor init block of employee2 class")
        println("$empName")
    }

    constructor(empName:String, empId:Int,empAddress:String,cmpName: String,cmpId:Int,cmpAdress:String): this(empName,cmpName){
       println("employee2 class secondary constructor")
        println("$empId $empAddress")
    }
}

fun main(){
    Employee2("Bharathi", empId = 1111, empAddress = "Chennai", cmpName = "Scheinder Electric", cmpId = 987897, cmpAdress = "chennai")
}