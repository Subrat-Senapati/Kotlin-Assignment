package Assignment_June_13

fun main(){
    val sum = operateOnNumbers(10, 5) { x, y -> x + y }
    val product = operateOnNumbers(10, 5) { x, y -> x * y }
    val difference = operateOnNumbers(10, 5) { x, y -> x - y }

    println("Sum: $sum, Product: $product, Difference: $difference")
}

fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}