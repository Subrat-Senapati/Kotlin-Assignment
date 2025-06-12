package Assignment_June_10

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("User1", 21)
    println("Name: ${person.name}, Age: ${person.age}")
}