package com.bharathi.kotlinbasics.dsaalgoritm.kunalbootcamp

import java.util.Locale
import java.util.Scanner


fun main(){
    val inputScanner = Scanner(System.`in`)
    //println("Enter to string to check whether is palindrom or not?")
    //val input = inputScanner.nextLine()
    //println("$input is ${findPalindrom(input)}")
   // println("${firstPalindrome(arrayOf("abc","car","ada","racecar","cool"))}")
    println("${findPalindromFromInputWhichContainsNonAlphaNumeric("A man, a plan, a canal: Panama")}")
}

fun findPalindrom(input: String): String {
    var result = "PALINDROME"
    if (input.trim().isEmpty()) throw Exception("It's empty string")
    var starttPointer = 0
    var endPointer = input.length-1
    while (starttPointer<=endPointer){
        if(input[starttPointer] == input[endPointer]){
            starttPointer++
            endPointer--
        }else {
           result = "Not a PALINDROME"
            break
        }
    }
    return result
}


fun firstPalindrome(words: Array<String>): String {
    var result = ""
    run {
        words.forEach{ str ->
            var startPointer = 0
            var endPointer = str.length-1
            result = str
            while(startPointer<endPointer){
                if(str[startPointer] == str[endPointer]){
                    startPointer+=1
                    endPointer-=1
                }else{
                    result = ""
                    break
                }
            }
            if(result!=""){
                return@run
            }
        }
    }
    return result
}

fun findPalindromFromInputWhichContainsNonAlphaNumeric(string: String):Boolean{
    val str = string.toLowerCase(Locale.ROOT).filter { it.isLetter() || it.isDigit() }
    println(str)
    return false
}
