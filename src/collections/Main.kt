package collections

fun main(args: Array<String>) {
    val list = listOf(1,2,3)
    val set = setOf(1,2,2,3)
    val map = mapOf(1 to "one",2 to "two")

    println(list.max())
    println(list.average())
    println(set)
    println(map)
}