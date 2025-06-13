package Assignment_June_13

fun main(){
    val result = applyToNumber(5) { it * it }
    println("Result: $result")
}

fun applyToNumber(x: Int, operation: (Int) -> Int): Int {
    return operation(x)
}