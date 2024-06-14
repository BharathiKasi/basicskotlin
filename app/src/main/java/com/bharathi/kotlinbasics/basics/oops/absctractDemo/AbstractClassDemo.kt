package com.bharathi.kotlinbasics.basics.oops.absctractDemo

abstract class Vehicle{
    abstract val name:String
    abstract val brand:String
    open val isHeavyVehicle = false
    abstract fun printNoOfWheel()

    open fun start(){
        println("Press button to start")
    }
    open fun stop(){
        println("Press button to stop")
    }

    open fun printIsHeavyVehicle(){
        println("is heavy vechile $isHeavyVehicle")
    }
}

class Car(name:String,brands:String) : Vehicle() {

    override val brand: String = brands
    override val name: String = name
    override val isHeavyVehicle: Boolean
        get() = false

    override fun printNoOfWheel() {
        println(" Car has 4 wheel")
    }

    fun printNameAndBrand(){
        println("Car name is $name and brand is $brand")
    }

    override fun printIsHeavyVehicle() {
        println("Car is heavy vechicle $isHeavyVehicle")
    }
}

fun main(){
    val car = Car("Baleno","Maruti Suzuki")
    car.printNameAndBrand()
    car.printNoOfWheel()
    car.printIsHeavyVehicle()
    car.start()
    car.stop()
}