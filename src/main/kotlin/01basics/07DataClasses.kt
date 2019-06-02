package `01basics`

// POJO
// equals(), hashCode() and copy()
// toString()
data class User(
    val name: String,
    var password: String,
    val age: Int
)

fun main() {
    val user = User("Heitor", "123", 24)
    println(user)
    println(user.name)
    println(user.component1())

    val (_, psw, age) = user
    println(psw)
    println(age)
}
