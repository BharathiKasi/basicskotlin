package com.bharathi.kotlinbasics.basics.oops.inheritance

open class  Car {

    open val noOfWheels = 4
    open val spareWheel = 1
    open fun printNoOfWheels(){
        println("All cars will have $noOfWheels wheels")
    }
}

class Baleno(model:String, val brand: String,val ownerName:String): Car(){
    override val spareWheel: Int = 2
    val model:String = model

    fun printModel(){
        println("Baleno Car model is $model")
    }
    fun printBrandName(){
        println("Brand name  is $brand")
    }

    fun printOwner(){
        println("owner name is $ownerName")
    }

    override fun printNoOfWheels() {
        println("Actually i modified baleno wheel is 5 ")
    }
}



class EcoSport(model:String, val brand: String,val ownerName:String): Car(){
    override val spareWheel: Int = 5
    val model:String = model

    fun printModel(){
        println("EcoSport Car model is $model")
    }
    fun printBrandName(){
        println("Brand name  is $brand")
    }

    fun printOwner(){
        println("owner name is $ownerName")
    }

    override fun printNoOfWheels() {
        super.printNoOfWheels()
    }
}

fun main(){

    val baleno = Baleno("Alpha","Maruti Suzuki","Bharathi")
    baleno.printModel()
    baleno.printNoOfWheels()
    baleno.printBrandName()
    baleno.printOwner()

    val ecoSport = EcoSport("X+","Ford","Arularasan")
    ecoSport.printModel()
    ecoSport.printNoOfWheels()
    ecoSport.printBrandName()
    ecoSport.printOwner()
}

