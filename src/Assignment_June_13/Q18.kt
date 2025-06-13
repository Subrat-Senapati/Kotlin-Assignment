package Assignment_June_13

fun main(){
    val list = listOf(1, 2, 3, 10, 5, 2, 1)

    val taken = list.takeWhile { it < 10 }
    println("takeWhile (<10): $taken") // Stops when first element ≥ 10

    val dropped = list.dropWhile { it < 10 }
    println("dropWhile (<10): $dropped") // Drops until first element ≥ 10, keeps rest
}