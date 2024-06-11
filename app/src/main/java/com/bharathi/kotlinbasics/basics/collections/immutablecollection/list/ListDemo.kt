package com.bharathi.kotlinbasics.basics.collections.immutablecollection.list


fun main() {
    val list = listOf(100, 3, 4, "Bharathi", 0.4F, 'P',"Bharathi")
    val list2 = listOf<Int>(1, 2, 3, 5, 6, 6, 7, 7)
    println("size method is used to print size of list $list.size")
    println("get method is used to get particular index from list ${list.get(0)}")
    val iterator = list.listIterator()
    println("Iterating the list to forward direction using iterator")
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("Iterating the list to backward direction using iterator")
    while (iterator.hasPrevious()) {
        println(iterator.previous())
    }
    println("sublist method is used to create new list from parent list using from and end range")
    val sublit = list.subList(0,list.size-2)
    println("the sublist is ${sublit}")
    println("the index of method is used to get the particluar index value")
    println("here we are trying to get the index value based on the data ${list.indexOf("Bharathi")}")
    println("last index is used to print the last if it contains it will print index else -1 "+ list.lastIndexOf("Bharathi"))
    println("last method is used to print the last value from the list ${list.last()}")
    println("first method is used to print the first value from the list ${list.first()}")
    println("drop the 1 element ${list.drop(1)}")
    println("map is higher order function and it is used to create new list from the existing one ")
    println("before using map function list2 is ${list2}")
    val newList = list2.map {
        if(it / 2 == 0) {
            it
        }else {
            it*3
        }
    }
    println("new list after using map function for list2 ${newList}")

    println("using filter we fetch required elements from list using the predicate condition")

    val oddNumberList = newList.filter { it%3==0 }
    println("we filted the odd number from newList and created new list called evenNumberList ${oddNumberList}")


}