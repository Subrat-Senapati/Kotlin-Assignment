package Assignment_June_8

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}