package functions

fun main(args: Array<String>) {
    defaultValue()

    println("Hello" concat " Ilkin")

    println(myVarArg(1,2,3)[1])
}

fun defaultValue(s: String = "Hello") {
    println(s)
}

infix fun String.concat(other: String) = this + other

fun myVarArg(vararg v: Int): IntArray {
    val myArray = IntArray(v.size)
    for (i in 1 until v.size){
        myArray[i] = v[i]
    }
    return myArray
}