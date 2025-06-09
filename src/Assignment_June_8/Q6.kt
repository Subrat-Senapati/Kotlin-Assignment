package Assignment_June_8

fun sumOfOddNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (num in numbers) {
        if (num % 2 != 0) {
            sum += num
        }
    }
    return sum
}

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    println("Sum of odd numbers: ${sumOfOddNumbers(nums)}")
}
