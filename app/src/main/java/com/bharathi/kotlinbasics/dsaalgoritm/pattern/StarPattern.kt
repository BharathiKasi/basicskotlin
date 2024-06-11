package com.bharathi.kotlinbasics.dsaalgoritm.pattern


/**
 * Pattern Link -> https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 *
 */
fun main(){
    //print5X5Stars()
    //printStargradually()
    //printNumberGradually()
    //printNumberDoubleAndGradually()
    //printStarFromHighToLowIndex()
    //printNumberFromHighToLowIndex()
    //printStarStartAndEndIndex()
    //printStarBy135etc()
    //printStarLikeCone()
    //printStarLikeWill()
    print0sAnd1s()
}

fun print5X5Stars(){

    for(row in 1..5){
        for(index in 1..5){
            print("*")
        }
        println()
    }
}


/**
 * expected output could be
 * *
 * **
 * ***
 * ****
 * *****
 */
fun printStargradually(){

    for(row in 1..5){
        for(index in 1..row){
            print("*")
        }
        println()
    }

}

/**
 * sample output could be
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
fun printNumberGradually(){

    for(row in 1..5){
        for(index in 1..row){
            print(index)
        }
        println()
    }
}

/**
 * Sample output could be
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */
fun printNumberDoubleAndGradually(){
    for(row in 1..5){
        for(index in 1..row){
            print(row)
        }
        println()
    }

}

/**
 * Sample Output could be
 * *****
 * ****
 * ***
 * **
 * *
 */
fun printStarFromHighToLowIndex(){
    for(row in 5 downTo 1){
        for(index in row downTo 1){
            print("*")
        }
        println()
    }
}

/**
 * Sample Output
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
fun printNumberFromHighToLowIndex(){
    for(row in 5 downTo 1){
        for(index in 1..row){
            print(index)
        }
        println()
    }

}

/**
 * Sample Out
 *  *******
 *   *****
 *    ***
 *     *
 */
fun printStarStartAndEndIndex(){
    var startPointer = 1
    var endPointer = 9
    for (row in 9 downTo 1){
        for(index in 1..row){
            if(index>=startPointer  && index<=endPointer){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
        startPointer++
        endPointer--
    }
}

/**
 * Sample Output
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
fun printStarBy135etc(){
    val midValue = (9/2)+1
    var startPointer = midValue
    var endPointer = midValue
    for(row in 1..5){
        for(index in 1..9){
            if(index>=startPointer && index<=endPointer){
                print("*")
            }else {
                print(" ")
            }
        }
        println()
        startPointer--
        endPointer++
    }
}

/**
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
fun printStarLikeCone(){
    val middle = 10/2
    var startPointer = middle
    var endPointer = middle

    for (row in 1..10){

        for(index in 1..10){

            if(index>=startPointer && index<=endPointer){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
        if(row>=middle){
            startPointer++
            endPointer--
        }else{
            startPointer--
            endPointer++
        }
    }
}

/**
 * Sample Output
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 */
fun printStarLikeWill(){
    var middle = (9/2)+1
    var pointer = 1
    for(row in 1..9){
        for(index in 1..pointer){
            print("*")
        }
        println()
        if(row<middle){
            pointer++
        } else{
            pointer--
        }
    }

}

fun print0sAnd1s() {
    var value = 1
    var indexPointer = 1
    for (row in 1..10) {
        for (index in 1..row) {
            print("${value} ")
            value = if (value == 1) {
                0
            } else {
                1
            }
        }
        value = if (indexPointer == 1) {
            0
        } else {
            1
        }
        indexPointer = value
        println()
    }
}


