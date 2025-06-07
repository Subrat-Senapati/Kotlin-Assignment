package Assignment_June_7
import kotlin.random.Random

fun main(){
    val tipNumber = Random.nextInt(1, 5)
    val tip = when (tipNumber) {
        1 -> "Tip #1: A yawn is a silent scream for coffee!"
        2 -> "Tip #2: Behind every successful person is a substantial amount of coffee."
        3 -> "Tip #3: Life happens, coffee helps."
        4 -> "Tip #4: Espresso yourself!"
        else -> "Enjoy your brew!"
    }
    println("Coffee Shop Tip: $tip")
}