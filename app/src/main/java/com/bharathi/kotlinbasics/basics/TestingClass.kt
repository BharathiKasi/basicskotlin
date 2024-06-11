package com.bharathi.kotlinbasics.basics

import android.util.Log
import androidx.core.text.isDigitsOnly


fun main(){
    //println( interpret("G()(al)"))
    //println(sortSentence("is2 sentence4 This1 a3"))
    //println(sortSentence("Myself2 Me1 I4 and3"))
    //println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"))
    //println(areNumbersAscending("hello world 5 x 5"))
    //println(romanToInt("III"))
    println(romanToInt2("MCMXCIV"))
}


fun IntArray.getSortedArray(array:IntArray):IntArray{
    val sortedArray = IntArray(array.size,{-1})
    var lessValue = 0
    for((index,value) in array.withIndex()){
        for(value2 in 0 until array.size-1){
            if(array[value2]<value){
                lessValue+=1
            }
        }
        sortedArray[index] = lessValue
        lessValue = 0
    }
    return sortedArray
}


fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    val intArray = ArrayList<IntArray>(image.size)
    for((index1,value1) in image.withIndex()){
        val tempArray = IntArray(value1.size)
        var startPointer = 0
        var endPointer = value1.size-1
        for(value in value1){
            if(startPointer!=endPointer){
                tempArray[startPointer] = getInverValueByInput(value1[endPointer])
                tempArray[endPointer] =  getInverValueByInput(value1[startPointer])
            }else{
                tempArray[startPointer] = getInverValueByInput(value1[endPointer])
            }
            startPointer++
            endPointer--
        }
        intArray.add(tempArray)
    }
    return intArray.toTypedArray()
}

fun getInverValueByInput(input:Int):Int{
    return if(input==0) 1 else 0
}

fun interpret(command: String): String {
    var str = ""
    var preChar = ' '
    for(index in command.indices){
        if(preChar==' '){
            val char = command[index]
            if(char=='('){
                preChar = char
            }else if(char !=')'){
                str+=char
                preChar = ' '
            }
        }else if(command[index]==')' && preChar=='('){
            str+="o"
            preChar = ' '
        } else {
            str+=command[index]
            preChar = ' '
        }
    }
    return str
}

fun sortSentence(string:String):String{
    val stringList = string.split(" ").toTypedArray()
    var result = ""
    run{
        loo1@for((index,value) in stringList.withIndex()){
            loop2@for(index2 in index+1 .. stringList.size){
                val str1 = stringList[if(index2==stringList.size) index else index2]
                val position = Integer.parseInt(str1.last().toString())
                val position2 = Integer.parseInt(value.last().toString())
                if(index == position-1){
                    val temp = value
                    stringList[index] = str1.substring(0,str1.length-1)
                    if(position !=position2){
                        stringList[index2] = temp
                    }
                    break@loop2
                }
            }

        }
    }
    stringList.forEach {
        result+=" $it"
    }
    result = result.trimStart()
    return result
}

fun areNumbersAscending(s: String): Boolean {
    var result = true
    val array = s.split(" ").toTypedArray()
    var oldValue = -1
    loop1@ for(value in array){
        try {
           val int = Integer.parseInt(value)
           if(oldValue<int){
               oldValue = int
           }else{
               result = false
               break@loop1
           }
        }catch (e:Exception){
        }
    }
    return result
}


fun romanToInt(s: String): Int {
    val romanToIntMap = mapOf<String,Int>("I" to 1,"V" to 5,"X" to 10,"L" to 50,
        "C" to 100,"D" to 500, "M" to 1000,
        "IV" to 4,"IX" to 9,"XL" to 40,"XC" to 90,
        "CD" to 400, "CM" to 900)
    var result = 0
    var oldChar = ' '
    var oldValue = 0
    for((index,char) in s.withIndex()){
        if(oldChar!=' '){
            val strValue = oldChar+char.toString()
            if(romanToIntMap.containsKey(strValue)){
                val intValue =  romanToIntMap.getValue(strValue)
                result -=oldValue
                result+=intValue
                oldChar = char
                oldValue = intValue
            }else{
                val intValue =  romanToIntMap.getValue(char.toString())
                result+=intValue
                oldChar = char
                oldValue = intValue
            }
        }else {
            if(romanToIntMap.containsKey(char.toString())){
                oldValue = romanToIntMap.getValue(char.toString())
                result+=oldValue
                oldChar = char
            }
        }
    }
    return result
}

fun romanToInt2(s: String): Int {
    val map = HashMap<Char, Int>()
    map.put('I', 1)
    map.put('V', 5)
    map.put('X', 10)
    map.put('L', 50)
    map.put('C', 100)
    map.put('D', 500)
    map.put('M', 1000)
    var ans = 0
    val arr = s.toCharArray()
    for (i in arr.indices) {
        if (i < arr.size - 1 && map[arr[i]]!! < map[arr[i+1]]!!) {
            ans -= map[arr[i]]!!
        } else {
            ans += map[arr[i]]!!
        }
    }

    return ans
}