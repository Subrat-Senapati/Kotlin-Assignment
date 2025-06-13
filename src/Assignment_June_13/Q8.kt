package Assignment_June_13

fun main(){
    val sentence = "Kotlin is a programming language."
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val foundVowels = sentence.lowercase().filter { it in vowels }.toSet()
    println("Unique vowels: $foundVowels")
}