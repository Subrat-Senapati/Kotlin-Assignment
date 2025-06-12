package Assignment_June_10

class PersonClass(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)
}

fun main() {
    val person1 = PersonClass("User1")
    println("Name: ${person1.name}, Age: ${person1.age}")
}