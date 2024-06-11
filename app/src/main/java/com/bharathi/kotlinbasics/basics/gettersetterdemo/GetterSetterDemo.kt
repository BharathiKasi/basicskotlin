package com.bharathi.kotlinbasics.basics.gettersetterdemo

class GetterSetterDemo {

    var abc = ""      //val we cannot use the setter ang getter property
        set(value) {
            field = value
        }
        get() = field
    var str:String = "Hai this is default value"
        get() = field
        set(value)  {
            field = value
        }
}