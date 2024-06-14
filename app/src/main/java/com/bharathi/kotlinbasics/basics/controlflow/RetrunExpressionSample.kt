package com.bharathi.kotlinbasics.basics.controlflow

fun main(){
    //foo()
    //doReturnWithLable()
    //println(defaultArgumentSample(1,2,'f'))
    println(lambaExpression(10,20))
    //call lambda expression using invoke method
    println(lambaExpression.invoke(20,30))
    doReturnWithLable()
}

fun foo(){
    for(i in 1..10){
        for(j in (i+1)..100){
            if(i == 5){
                return
            }
            else {
                println("Value of i == ${i} and J is = ${j}")
            }
        }
    }
}


fun doReturnWithLable(){
   val list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)

    list.forEach  {

        if(it == 5){
            return@forEach
            return
        }else {
            println(it)
        }
        if(true){
            return@forEach
        }
    }
}

fun defaultArgumentSample(a:Int = 10, b:Int = 20,c:Char = 'o'):Int{

    return a.plus(b)
}


val lambaExpression : (Int,Int) -> Int =  { a,b ->
    a.plus(b)

}