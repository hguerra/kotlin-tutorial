package `03advanced`

fun tell(text: String) {
    println(text)
}

fun main() {
    // can hold any function that has the corresponding signature
    var funVar: (String) -> Unit
    funVar = ::tell

    funVar("Eu te amo muito amor <3")

    // wisdom has no arguments and gives back nothing meaningful
    val wisdom: () -> Unit = {
        println("Life is short")
    }

    wisdom()

    val wisdom2 = {
        println("Life is short 2")
    }

    wisdom2()
}