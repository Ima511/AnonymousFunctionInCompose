package com.example.anonymousfunctionincompose

// Anonymous Functions

fun main(){

    // Anonymous Functions
    val add = fun(a:Int, b:Int): Int {return a+b}
    println(add(10,20))

    // V.I Note: If the method body has only one statement,
    //      we can omit the return keyword and the braces.

    val add2 = fun(a:Int, b:Int):Int = a+b
    println(add2.invoke(10,20))

    // Types of Anonymous Functions
    // With Parameters and Return Value
    val multiply = fun(a:Int, b:Int):Int {return a * b}
    println(multiply.invoke(4,5))

    // With Parameters and No Return Value
    val multiply2 = fun(a:Int, b:Int):Unit { println(a*b) }
    multiply2.invoke(4,5)


    // No Parameters and Return Value
    val msg = fun(): String{return "Wel come to our course"}
    println(msg())


    // No Parameters and No Return Value
    val msg2 = fun():Unit{ println("Welcome Abhay") }

}