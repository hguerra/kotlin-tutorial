package `01basics`

fun main() {
    // A rather unique feature of Kotlin is that collections comes both in a mutable and immutable form

    // List
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    numbers.add(4)
    println(numbers)

    val fixedNumbers: List<Int> = listOf(1, 2)
    println(fixedNumbers)

    // Sets
    val uniqueNumbers: MutableSet<Int> = mutableSetOf(1, 3, 2)
    uniqueNumbers.add(3)
    println(uniqueNumbers)

    // Maps
    val map1: MutableMap<Int, String> = mutableMapOf(Pair(1, "one"))
    println(map1[1])

    val map2: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two")
    for ((k, v) in map2.entries) {
        println("Key: $k, value: $v")
    }
}