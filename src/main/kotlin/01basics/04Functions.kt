package `01basics`

fun main() {
    fun tellMe(): Unit {
        println("You are the best!")
        return Unit
    }

    fun tell(who: String, what: String): String {
        return "$who is $what"
    }

    fun drawText(x: Int = 0, y: Int = 0, size: Int = 20, spacing: Int = 0, text: String) {
        println(text)
    }

    // Single-Expression Functions
    fun numberRaisedToPowerOfTwo(number: Int) = number * number
    fun imprime(text: String) = println(text)

    tellMe()
    println(tell("Heitor", "is awesome"))
    drawText(text = "Uhuu")
    println(numberRaisedToPowerOfTwo(2))
    imprime("Heitor")
 }
