package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.lang.NumberFormatException
import java.util.Scanner


fun main() {

    val inputStream = Scanner(System.`in`)
    var value = 0
    do {
        val ll = IntArray(5)
        val input = inputStream.nextLine()
        try {
            value += Integer.valueOf(input)
        } catch (e: NumberFormatException) {
            e.printStackTrace()
            println(value)

        }
    } while (input != "x")

}