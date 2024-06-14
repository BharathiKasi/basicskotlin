package com.bharathi.kotlinbasics.basics.oops.extensiondemo

class ExtensionDemo(val str:String) {

    init {
        str2 = str
    }
    companion object{
        lateinit var str2 :String
        fun printContructorParam(){
            println("this is companion method and the constructor param is $str2")
        }
    }


}

fun main(){
    val extensionDemo = ExtensionDemo("Bharathi")
    ExtensionDemo.printContructorParam()
    100.toConverString()
}

fun Int.toConverString(){
    println(this.toString())
}