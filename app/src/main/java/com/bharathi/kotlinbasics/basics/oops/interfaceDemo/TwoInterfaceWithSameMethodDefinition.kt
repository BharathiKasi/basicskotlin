package com.bharathi.kotlinbasics.basics.oops.interfaceDemo

interface InterfaceA{

    fun printYourInterest(interest:String){
        println("InterfaceA: Your interest is $interest right?")
    }
}

interface InterfaceB{
    fun printYourInterest(interest:String){
        println("InterfaceB: Your interest is $interest right?")
    }

    fun printHowToImproveYourInterest() {
        println("InterfaceB : Practice makes the perfect man")
    }
}

//Note - Even though the InterfaceA and InterfaceB have same method with definition. When we call this method from implementation class
// then the compiler will confuse which one to call like Ambiguity.
//To avoid this only compiler enforcing to override the function which is having Same signature in different interfaces.
//In our example InterfaceA and InterfaceB both havign same function name and same paramter and same signature also.
//that is the reason we are overriding the method.

//But printHowToImproveYourInterest is unique which is available in InterfaceB only. So that is what the compiler
// is not asking to overridde it.
class InterfaceDefinitionDemo: InterfaceA,InterfaceB{
    override fun printYourInterest(interest: String) {
        super<InterfaceA>.printYourInterest(interest)
        super<InterfaceB>.printYourInterest(interest)
    }
}

fun main(){
    val interfaceDefinitionDemo = InterfaceDefinitionDemo()
    interfaceDefinitionDemo.printYourInterest("FootBall")
    interfaceDefinitionDemo.printHowToImproveYourInterest()
}