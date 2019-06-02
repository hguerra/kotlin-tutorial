package `01basics`

fun main() {
    // A Safe and Powerful Design
    val number = 2
    when (number) {
        0 -> println("Invalid number")
        1, 2 -> println("Number too low")
        3 -> println("Number correct")
        4 -> println("Number too high, but acceptable")
        else -> println("Number too high")
    }

    var result = when (number) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        4 -> "Number too high, but acceptable"
        else -> "Number too high"
    }

    println("Returned: '$result'")

    val check = true
    val isCheck = when(check) {
        true -> {
            println("its true")
            true
        }
        false -> {
            println("its false")
            false
        }
    }

    println(isCheck)

    // Arbitrary Condition Branches
    result = when (100) {
        0 -> "Invalid number"
        1, 2 -> "Number too low"
        3 -> "Number correct"
        in 4..10 -> "Number too high, but acceptable"
        !in 100..Int.MAX_VALUE -> "Number too high, but solvable"
        else -> "Number too high"
    }

    println("Returned: '$result'")

    fun isValidType(x: Any): Boolean = when(x) {
        is String -> true
        is Int -> true
        else -> false
    }

    println("Is valid type: ${isValidType(1.0)}")

    // Using when Without an Argument
    // if / else if
    val text = "hello"
    when {
        number > 1 -> println("number is heigher than five")
        text === "hello" -> println("uhuu")
    }
}