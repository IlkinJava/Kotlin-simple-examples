package io_examples

fun main(args: Array<String>) {
    println("Hello Kotlin")
    println(sum(10, 5))
    var i: Int
    val j = "Hello World"
    val tmp = 5

    println("Value is $tmp")
    println("Value size is ${j.length}")

}

fun sum(a: Int, b: Int) = a + b