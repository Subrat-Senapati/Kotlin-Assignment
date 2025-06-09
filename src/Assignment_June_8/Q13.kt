package Assignment_June_8

fun main() {
    val strNumber: String? = "123"

    val result = strNumber?.toIntOrNull()?.times(2)
    println(result ?: "Invalid number")
}
