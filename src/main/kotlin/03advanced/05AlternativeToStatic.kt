package `03advanced`

// You can define methods that seem to extend existing classes.
fun String.bePolite() : String {
    return "${this}, please"
}

// A Singleton is Better than Static
object Numbers {
    var allNumbers = mutableListOf(1,2,3,4)
    fun sumNumbers(a: Int, b: Int) : Int = a + b
}

// Companion objects are ideals for the factory method pattern or as alternative to static fields.
class User private constructor(val name: String) {
    // the constructor of the class is private
    companion object {
        // but the companion object can access it
        fun newUser(nickname: String) = User(nickname)
    }
}

fun main() {
    // Alternativas para o Static

    // 1) criar funcoes
    // 1.1) kotlin possui extensions para extender uma classe
    // 1.2) kotlin permite declarar fist-level functions (arquivos somente com funcoes)
    val request = "Pass the salt"
    println(request.bePolite())

    // 2)  Propriedades globais
    // 2.1) kotlin possui a palavra reservada object para criar singleton
    println(Numbers.allNumbers)
    println(Numbers.sumNumbers(1, 2))

    val heitor = User.newUser("Heitor")
    println(heitor.name)
}