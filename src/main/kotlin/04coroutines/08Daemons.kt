package `04coroutines`

import kotlinx.coroutines.*

fun main() = runBlocking {
    //sampleStart
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // just quit after delay
//sampleEnd
}
