package `04coroutines`

import kotlinx.coroutines.*

// https://superkotlin.com/coroutines/

// The purpose of coroutines is to take care of
// the complications in working with asynchronous programming

//1) Simplificar callbacks
// gerenciar operacoes com longo tempo de execucao (IO)
// sem bloquear a thread

// 2) suspende o processo sem ocupar a thread

// 3) uma alternativa mais barata do que thread

// Conceito
// Coroutines sao blocos de codigo que podem ser suspensos sem bloquear a thread
// a thread pode fazer outras coisas enquanto a coroutine esta suspensa (diferente de uma thread natural)

// uma couroutine so pode ser suspensa com o modificador suspend

suspend fun answer() {
    println("Dentro do metodo com suspend!")
}

fun main() {
    println("Chamada com bloqueio")
    GlobalScope.launch() {
        answer() // it prints this second
    }

    println("Ola !") // it prints this first
    Thread.sleep(2000L)
}