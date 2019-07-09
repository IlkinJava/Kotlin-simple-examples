package class_examples

class User(var name: String)

enum class Days {
    MONDAY, TUESDAY, WEDNESDAY
}

fun main(args: Array<String>) {
    var user = User("Ilkin")
    user.name = "John"
    println(user.name)

    println(test(5, 6))

    enumWhen(Days.WEDNESDAY)
}

fun test(a: Int, b: Int) = if (a > b) a else b

fun enumWhen(d: Days) {
    when (d) {
        Days.MONDAY -> print("monday")
        Days.TUESDAY -> print("tuesday")
        else -> {
            print("wednesday")
        }
    }
}