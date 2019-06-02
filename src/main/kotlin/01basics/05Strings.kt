package `01basics`

fun main() {
    // Strings are immutable, so whenever you are modifying a new string you are actually creating a new one
    var text: String = "Kotlin is awesome"
    println(text[0])

    // The escape sequences supported are: \t, \b, \n, \r, \', \", \\ and \$
    // Unicode escape sequence syntax to input any character by referencing its code point. For example, \u0037 is equivalent to 7.
    println("\u0037")

    // Concatenate strings using the + operator
    println(text + " uhuuu")

    // string templates
    val who = "Heitor"
    println("$who is awesome")

    // arbitrary string template expression
    println("${4 + 3} is 7")

    // raw strings
    val multiline = """
        a
        b
        c
        $who
    """
    println(multiline)

    val sql = """
        select "name", "age"
        from person
        where name = '$who'
    """.trimIndent()
    println(sql)

    val margin = """Hello,
        |I finally wrote the email.
        |Sorry for the delay.
    """.trimMargin()
    println(margin)
}
