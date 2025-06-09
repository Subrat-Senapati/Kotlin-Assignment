package Assignment_June_8

fun main() {
    val numbers = listOf(2, 4, 6, 8)
    val squaredNumbers = mutableListOf<Int>()

    for (num in numbers) {
        val square = num * num
        squaredNumbers.add(square)
    }

    println("Squared numbers: $squaredNumbers")
}