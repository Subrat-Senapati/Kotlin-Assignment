package Assignment_June_8

fun main() {
    val names = mutableListOf("Alice", "Bob", "Ankit", "Ravi", "Arjun", "John")

    var i = 0
    while (i < names.size) {
        if (names[i].startsWith("A", ignoreCase = true)) {
            names.removeAt(i)
        } else {
            i++
        }
    }

    println("Filtered names: $names")
}