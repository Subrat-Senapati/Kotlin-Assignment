package Assignment_June_13

fun main(){
    val words = listOf("Kotlin", "Java", "Python")
    val lengths = words.map { it.length }
    println("Lengths: $lengths")
}