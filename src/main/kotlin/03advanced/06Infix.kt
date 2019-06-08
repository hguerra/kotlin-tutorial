package `03advanced`

// infix pode ser usado para declarar um metodo para ser executado sem
// a necessidade de utilizar parenteses
infix fun String.fala(mensagem: String) = "$this falou $mensagem!"

fun main() {
    val heitor = "Heitor"
    val mensagem = heitor fala "Oi"
    println(mensagem)
}