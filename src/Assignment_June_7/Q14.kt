package Assignment_June_7

fun main(){
    val temperature = 65
    val tempCategory = when {
        temperature < 50 -> "Too Cold"
        temperature in 50..70 -> "Perfect"
        else -> "Too Hot"
    }
    println("Coffee temperature is $temperature°C – $tempCategory")
}