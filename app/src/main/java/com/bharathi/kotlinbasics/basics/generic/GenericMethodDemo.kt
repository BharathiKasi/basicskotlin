package com.bharathi.kotlinbasics.basics.generic


fun main(){

    val list = arrayListOf(10,30,40,50,60,70,80)
    printValue(list, value2 = "param 2 generic type")
    println("Now sorting your list<Int> type")
    list.sortYourArrayList()
    println(list)
    val listOfString = arrayListOf("asdf","sdf","sdfsf","sfsdfs")
    println("Now sorting your list<Strig> type")
    listOfString.sortYourArrayList()
    println(listOfString)


}

fun <T,U> printValue(arrayList: ArrayList<T>, value2 :U){
    for (value in arrayList){
        println(value)
    }
    println(value2)
}


fun <T> ArrayList<T>.sortYourArrayList():ArrayList<T>{
    return this
}