package com.bharathi.kotlinbasics.basics.oops.sealedclassdemo

sealed class SealedClassDemo(val test:String) {
    class Temp(val string: String) : SealedClassDemo(test = string) {

        override fun test(){
            super.test()
            println("Temp" + test)
        }
    }

    open fun test(){
        println("SealedClassDemo: $test")
    }
}

fun main(){
    val sealedClassDemo = SealedClassDemo.Temp("1234")

}

fun printType(sealedClassDemo: SealedClassDemo){
    when(sealedClassDemo){
        is SealedClassDemo.Temp ->{

        }


    }
}