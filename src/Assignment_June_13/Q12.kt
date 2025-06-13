package Assignment_June_13

fun main(){
    val nums = listOf(1, 2, 3, 4, 5)
    val squares = nums.map { it * it }
    println("Squares: $squares")
}