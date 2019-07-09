package io_examples

fun main(args: Array<String>) {
    println("Hello Kotlin")
    println(add(10, 5))
    var i: Int
    val j = "Hello World"
    val tmp = 5

    println("Value is $tmp")
    println("Value size is ${j.length}")

}

fun add(a: Int, b: Int) = a + b