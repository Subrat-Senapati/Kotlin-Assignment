package Assignment_June_13

fun main(){
    val numbers = (1..20).toList()
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
}