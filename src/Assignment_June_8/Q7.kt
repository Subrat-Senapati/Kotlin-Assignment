package Assignment_June_8

fun describeSum(x: Int, y: Int): String {
    val sum = x + y
    return "Sum of $x and $y is $sum"
}

fun main() {
    println(describeSum(5, 7))
}
