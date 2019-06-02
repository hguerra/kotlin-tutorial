package `01basics`

fun main() {
    var top = 0
    val a = 1
    val b = 2

    // If
    if (a < b) top = a
    println(top)

    if (a > b) {
        top = a
    } else {
        top = b
    }

    println(top)

    // var with if
    val top2 = if (a < b) a else b
    println(top2)

    val top3 = if (a > 5) {
        println("a is greater than 5")
        a
    } else {
        println("5 is greater than a")
        5
    }

    println(top3)

    // For and Ranges
     for (e in 1..4) {
         println(">> $e")
     }

    if (a in 1..5) {
        println("a is inside the range")
    }

    for (e in 4 downTo 1) {
        println(">> $e")
    }

    for (e in 6 downTo 1 step 2)
        println(">> $e")

    for (e in 1 until 3)
        println(">> $e")

    // While
    var count = 3
    while (count > 0) {
        println("While: $count")
        count--
    }

    count = 3
    do {
        println("DoWhile: $count")
        count--
    } while (count > 0)
}