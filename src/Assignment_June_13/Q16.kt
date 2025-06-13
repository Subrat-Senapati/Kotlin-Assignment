package Assignment_June_13

fun main(){
    val factorial = (1..5).reduce { acc, num -> acc * num }
    println("Factorial of 5: $factorial") // Output: 120
}