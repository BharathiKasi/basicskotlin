package com.bharathi.kotlinbasics.dsaalgoritm.sorting


fun main(){
   var array = arrayOf(16,14,5,6,8)  //arrayOf(100,89,5,2,500,88,1,123,0)
    doBubbleSortFromGivenArray(array).map {
        print("${it} ")
    }

}

fun doBubbleSortFromGivenArray(array:Array<Int>):Array<Int>
{
    for(index in 0 until array.size){
        for(index2 in 0 until array.size-1-index){
            if(array[index2]>array[index2+1]){
                array[index2] = array[index2]+ array[index2+1]
                array[index2+1] = array[index2] - array[index2+1]
                array[index2] = array[index2] - array[index2+1]
            }
        }
    }
    return array
}