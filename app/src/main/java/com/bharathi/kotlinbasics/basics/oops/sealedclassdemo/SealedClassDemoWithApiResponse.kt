package com.bharathi.kotlinbasics.basics.oops.sealedclassdemo

import org.json.JSONObject

sealed class Resource {
    class Success(val json:Float) : Resource(){

        fun printResponse(){
            println(json)
        }
    }

    class Failure(reason:String) : Resource()

    class Exception(e:kotlin.Exception) : Resource()
}

data class TestResponse(val int:Int) : Resource(){

}
class TestCool(val str:String) : Resource()

fun main(){
    val jsonObject = 1234F
    val success = Resource.Success(jsonObject)
    checkResourceType(success)

    val testResource = TestResponse(100)
}

fun checkResourceType(resource: Resource){
    when(resource){
        is Resource.Success->{
            resource.printResponse()
        }
        is Resource.Failure ->{}
        is Resource.Exception ->{}
        is TestResponse -> {
        }
        is TestCool ->{

        }
    }
}