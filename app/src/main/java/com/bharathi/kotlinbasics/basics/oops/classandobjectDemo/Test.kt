package com.bharathi.kotlinbasics.basics.oops.classandobjectDemo

class Test {

    fun romanizer(numbers: List<Int>): List<String> {
        // Write your code here
        val list = ArrayList<String>()
        var temp = ""
        for (i in numbers.indices) {
            var value = numbers[i]

            while (value > 0) {
                val modValue  = value % 10
                temp = temp + getRomanFromArabic(modValue)
                if(modValue == value){
                    break
                }
            }
            list.add(temp)
            temp = ""
        }
        return list
    }

    private fun getRomanFromArabic(number: Int): String {
        when (number) {
            1 -> return "I"
            2 -> return "II"
            3 -> return "III"
            4 -> return "IV"
            5 -> return "V"
            6 -> return "VI"
            7 -> return "VII"
            8 -> return "VIII"
            9 -> return "IX"
            10 -> return "X"
        }
        return ""
    }
}

fun main(){
    val test = Test()
    println( test.romanizer(listOf(5,
        75,
        80,
        99,
        100,
        50)))
}