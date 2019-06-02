package `01basics`

import java.lang.Exception

class CustomException(error: String) : Exception(error)

fun throwError(message: String): Nothing {
    println(message)
    throw CustomException(message)
}

fun main() {
    var something = null // something has type Nothing?

    // Try Expression
    try {
        println("Try")
        throwError("Meu Erro :(")
    } catch (e: CustomException) {
        println("Catch")
    } finally {
        println("Finally")
    }

    val result: String = try {
        throwError("aaaa")
        "aaa"
    } catch (e: Exception) {
        "bbb"
    }

    println(result)
}