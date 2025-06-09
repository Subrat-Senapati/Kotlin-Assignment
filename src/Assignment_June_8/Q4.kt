package Assignment_June_8

fun main() {
    val words = listOf("ball", "apple", "car", "notebook", "pen")
    var count = 0

    for (word in words) {
        if (word.length > 4) {
            count++
        }
    }

    println("Words with more than 4 characters: $count")
}