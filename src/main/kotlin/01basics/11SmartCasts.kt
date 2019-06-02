package `01basics`

fun main() {
    val x: Any = "heitor"
    if (x is String && x.length > 0) {
        println(x.length)
    }
}