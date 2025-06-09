package Assignment_June_8

fun maxOrDefault(numbers: List<Int>?): Int {
    return if (!numbers.isNullOrEmpty()) {
        numbers.maxOrNull() ?: -1
    } else {
        -1
    }
}

fun main() {
    val nums: List<Int>? = listOf(5, 10, 2)
    println("Max: ${maxOrDefault(nums)}")

    val nullList: List<Int>? = null
    println("Max: ${maxOrDefault(nullList)}")
}
