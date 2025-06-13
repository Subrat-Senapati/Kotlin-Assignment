package Assignment_June_13

fun main(){
    val numbers = listOf(10, 60, 45, 100, 30, 75)
    val filtered = numbers.filter { it > 50 }
    println("Numbers > 50: $filtered")
}