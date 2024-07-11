package com.bharathi.kotlinbasics.basics

data class DataClassDemo(val name:String,val age:Int)




fun main(){
    val dataClassDemo = DataClassDemo(name = "Bharathi",age = 27)
    val dataClassDemo2 = dataClassDemo.copy(name = "Bharathi")
    println("hasCode of dataClassDemo ${dataClassDemo.hashCode()}" )
    println("hasCode of dataClassDemo2 ${dataClassDemo2.hashCode()}")
    println("dataClassDemo == dataClassDemo2 is  ${dataClassDemo == dataClassDemo2}")
    println("dataClassDemo === dataClassDemo2 is ${dataClassDemo === dataClassDemo2}")
    println("dataClassDemo.equals(dataClassDemo2) is ${dataClassDemo.equals(dataClassDemo2)}")

}
