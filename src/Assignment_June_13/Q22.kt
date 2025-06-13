package Assignment_June_13

fun main(){
    readListElement(5)
}

fun readListElement(index: Int) {
    val list = listOf("Kotlin", "Java", "Python")
    try {
        println("Element: ${list[index]}")
    } catch (e: IndexOutOfBoundsException) {
        println("Index out of bounds: ${e.message}")
    } finally {
        println("End of operation")
    }
}