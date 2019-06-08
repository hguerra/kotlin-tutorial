package `03advanced`

data class point(val x: Int, val y: Int)

class point2(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main() {
    val (x1, y1) = point(1, 2)
    println(x1)
    println(y1)

    val (x2, y2) = point2(1, 2)
    println(x2)
    println(y2)

    val (a, b, c) = listOf(1, 2, 3)
    println("a=$a, b=$b, c=$c")

    // ignorar um campo
    val (_, n) = point(1, 2)
    println(n)
}
