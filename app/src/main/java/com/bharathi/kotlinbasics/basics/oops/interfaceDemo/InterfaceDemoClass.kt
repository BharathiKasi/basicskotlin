package com.bharathi.kotlinbasics.basics.oops.interfaceDemo


interface Vehicle{

     val vehicleName:String
     val vehicleBrand:String
     val vehicleType:String

    fun printMaximumSpeed(maxSpeed:String){
        println("Your max speed limit is $maxSpeed")
    }
     fun start()
     fun stop()



}
open abstract class ElectricVehicle {

    fun printFuelType(){
        println("Electric Charge")
    }

    fun printVehicleDetails(name:String,brand: String){
        println("Your vechile name is $name and the brand is $brand")
    }

    abstract fun printVehicleType()


}

 class  ElectricCar(brand:String, name:String,type:String) : ElectricVehicle(),Vehicle{

    override val vehicleBrand: String = brand
    override val vehicleName: String = name
     override val vehicleType: String = type
    override fun printMaximumSpeed(maxSpeed: String) {
        super.printMaximumSpeed(maxSpeed)
    }

     override fun start() {
      println("Electric car push button to start")
     }

     override fun stop() {
         println("Electric car push button to stop")
     }

     override fun printVehicleType() {
         println("Type is $vehicleType")
     }
}

fun main(){

    val electricCar = ElectricCar("Maruti Suzuki","Baleno","Manual")
    electricCar.printVehicleDetails(electricCar.vehicleName,electricCar.vehicleBrand,)
    electricCar.printVehicleType()
    electricCar.printFuelType()
    electricCar.printMaximumSpeed("120 KMPH")
    electricCar.start()
    electricCar.stop()
}