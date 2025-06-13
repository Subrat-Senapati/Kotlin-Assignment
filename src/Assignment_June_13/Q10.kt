package Assignment_June_13

fun main(){
    val colors = setOf("Red", "Blue", "Green")
    val colorToCheck = "Blue"
    if (colorToCheck in colors) {
        println("$colorToCheck is in the set.")
    } else {
        println("$colorToCheck is not in the set.")
    }
}