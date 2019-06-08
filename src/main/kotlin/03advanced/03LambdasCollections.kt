package `03advanced`

fun main() {
    val li = listOf(1, 2, 3, 4, 5)
    val set = setOf("book", "very", "short")

    data class Number(val name: String, val value: Int)
    val numbers = listOf(Number("one", 1), Number("two", 2), Number("three", 3))

    // filter
    print("filter >> ")
    println(li.filter { it % 2 == 0 })

    // map
    print("map >> ")
    println(numbers.map { it.name })

    // filter and map
    print("filter and map >> ")
    println(li.filter { it % 2 == 0 }.map { it * 2 })

    // find
    print("find >> ")
    println(li.find { it % 2 == 0 })

    print("find >> ")
    println(set.find { it.length < 4 })
    println(set.find { it.length > 4 })

    // firstOrNull
    print("firstOrNull >> ")
    println(li.firstOrNull { it % 2 == 0 })

    // groupBy
    print("groupBy >> ")
    println(numbers.groupBy { it.value })
    println(li.groupBy { it % 2 == 0 })

    // fold
    print("fold >> ")
    val aggregate = listOf(5, 10)

    println(aggregate.fold(0, { start, element -> start + element }))
    println(aggregate.fold(5, { start, element ->
        val result = start - element
        println("start: $start, element $element -> result $result")
        result
    }))

    println(set.fold("A ", { start, element -> start + "$element " }))

    // flatten
    print("flatten >> ")
    val toFlatten = listOf(listOf(1, 2), listOf(3, 4))
    println(toFlatten.flatten())

    // flatMap
    print("flatMap >> ")
    println(numbers.flatMap { listOf(it.value) })
    println(numbers.map { listOf(it.value) }.flatten())
}