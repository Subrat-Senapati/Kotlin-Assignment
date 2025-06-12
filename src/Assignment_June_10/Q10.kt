package Assignment_June_10

open class Animal {
    open fun makeSound() {
        println("Animal makes sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
}