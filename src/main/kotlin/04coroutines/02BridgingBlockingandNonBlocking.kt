package `04coroutines`

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main thread continues here immediately
    runBlocking {     // but this expression blocks the main thread
        println("before blocking main thread...")
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
        println("after blocking main thread...")
    }

    println("Done!")
}
