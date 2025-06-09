package Assignment_June_8

fun main() {
    val number: Int? = 5

    val result = number?.let {"The value is $number"} ?: "Value is missing"
    println(result)
}
