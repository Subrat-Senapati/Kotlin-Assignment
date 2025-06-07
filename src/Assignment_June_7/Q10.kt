package Assignment_June_7

fun main(){
    val caffeineLevel = 72
    val strength = when (caffeineLevel) {
        in 0..33 -> "Mild"
        in 34..66 -> "Medium"
        in 67..100 -> "Strong"
        else -> "Unknown caffeine level"
    }
    println("Your coffee strength is: $strength")
}