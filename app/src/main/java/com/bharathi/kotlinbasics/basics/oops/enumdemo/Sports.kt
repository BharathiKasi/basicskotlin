package com.bharathi.kotlinbasics.basics.oops.enumdemo


enum class Sports(val s: String) {
    CRICKET("BAT and BALL"),
    FOOTBALL("Play FootBall"),
    HOCKEY("Hockey"),
}

fun main(){
    val cricket = Sports.CRICKET.s
    val hockeyOrdinal = Sports.HOCKEY.name
    println(cricket)
    println(hockeyOrdinal)
}