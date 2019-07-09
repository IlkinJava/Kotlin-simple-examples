package class_examples

class User(var name: String)

enum class Days {
    MONDAY, TUESDAY, WEDNESDAY
}

fun main(args: Array<String>) {
    var user = User("Ilkin")
    user.name = "John"
    println(user.name)

    println(returnGreater(5, 6))

    whenExample(Days.WEDNESDAY)
}

fun returnGreater(a: Int, b: Int) = if (a > b) a else b

fun whenExample(d: Days) {
    when (d) {
        Days.MONDAY -> print("monday")
        Days.TUESDAY -> print("tuesday")
        else -> {
            print("wednesday")
        }
    }
}