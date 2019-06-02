package `01basics`

fun main() {
    val obj = 1.0
    if (obj is Double)
        println(obj + 3.0)

    val number = 27
    val large: Double? = number as? Double
    println(large)

    val str = number as? String
    println(str)
}