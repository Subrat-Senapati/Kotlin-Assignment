package Assignment_June_8

fun formatFullName(firstName: String = "First", lastName: String = "Last"): String {
    return "$firstName $lastName"
}

fun main() {
    println(formatFullName("John", "Doe"))
    println(formatFullName("Alice"))
    println(formatFullName())
}
