package com.bharathi.kotlinbasics.basics.oops.interfaceDemo

interface HeavyVehicle{
    val max:Int
        get() = 1000
    var min:Int

}

class Truck : HeavyVehicle{
    override val max: Int
        get() = 2000

    override var min: Int
        get() = TODO("Not yet implemented")
        set(value) {}
}

