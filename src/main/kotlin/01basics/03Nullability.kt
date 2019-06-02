package `01basics`

fun main() {
    var text: String = "Heitor"
    text = "Outro texto"
    println(text)

    var unsafeText: String? = null
    println(unsafeText)

    if (unsafeText != null) {
        println(unsafeText.length)
    }

    // The safe call operator (?.) guarantees that the variable will be accessed only if unsafeText it is not null
    println(unsafeText?.length)

    // Elvis operator (?:).
    // Se a variavel for nulo retorna -1, se não retorna o tamanho
    val len = unsafeText?.length ?: -1

    // Non-null assertion operator (!!)
    // println(unsafeText!!.length) // kotlin.KotlinNullPointerException
}
