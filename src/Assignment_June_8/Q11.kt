package Assignment_June_8

fun main() {
    val name: String? = "Kotlin"

    if (!name.isNullOrBlank()) {
        println("Reversed: ${name.reversed()}")
    } else {
        println("Name is null or blank")
    }
}
