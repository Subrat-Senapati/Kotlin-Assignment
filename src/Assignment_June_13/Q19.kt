package Assignment_June_13

fun main(){
    divide(10, 0)
}

fun divide(a: Int, b: Int) {
    try {
        val result = a / b
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero: ${e.message}")
    }
}

