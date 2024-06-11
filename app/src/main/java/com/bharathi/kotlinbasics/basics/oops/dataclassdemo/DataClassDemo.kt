package com.bharathi.kotlinbasics.basics.oops.dataclassdemo

interface LivingBeing{
    fun eat()
}
interface Activities {
    fun doRun()
}
data class HumanBeing(val name:String) : LivingBeing,Activities{
    override fun eat() {
        println("Eat vegetable and meat also")
    }

    override fun doRun() {
        println("Running fast")
    }
}

fun main(){
    val dataClass = HumanBeing("Bharathi")
    dataClass.eat()
    dataClass.doRun()
}
