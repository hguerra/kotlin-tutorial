package `03advanced`

fun main() {
    val funVar: (String) -> Unit = { text: String -> println(text) }
    funVar("UHUU")

    // it prints 15
    println({ x: Int -> x * 3 }(5))

    // conventions
    val simpleFun: (Int) -> Int = { it + 2 }
    // this is equivalent to the following declaration
    // var simpleFun: (Int) -> Int = {i: Int -> i + 2 }
    println(simpleFun(2))

    fun double(number: Int = 1, calculation: (Int) -> Int) : Int {
        return calculation(number) * 2
    }

    val res1 = double(5) {
        it * 10
    }

    val res2 = double {
        it * 2
    }

    println(res1) // it prints 100
    println(res2) // it prints 4
}