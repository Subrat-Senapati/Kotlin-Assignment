package Assignment_June_13

fun main(){
    val fruits = mutableListOf("Mango", "Banana", "Melon", "Apple")
    fruits.removeAll { it.startsWith("M", ignoreCase = true) }
    println("Filtered fruits: $fruits")
}