import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    coroutineScope {
        launch {
            clock(5, "tick")
        }
        launch {
            clock(7, "tack")
        }
        launch {
            clock(10, "tuck")
        }
    }
}

suspend fun clock(seconds: Int, sound: String) {
    for (i in 0..<seconds - 1) {
        delay(1000L)
        println("$sound (${i + 1})\t")
    }
    delay(1000)
    println("$sound ($seconds) = BOOM")
}
