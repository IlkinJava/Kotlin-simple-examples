package loops

fun main(args: Array<String>) {
    val i = 1..10
    for (j in i) {
        print(j)
    }
    for (j in 1..5) {
        print(" $j")
    }
    for (j in 10 downTo 1 step 2) {
        print(" $j")
    }

    for (j in 1 until 10) {
        if (j in 5..9) print(" $j")
    }
}