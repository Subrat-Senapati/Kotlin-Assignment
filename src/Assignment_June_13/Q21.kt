package Assignment_June_13

fun main(){
    parseInt("123a")
}

fun parseInt(str: String) {
    try {
        val number = str.toInt()
        println("Parsed number: $number")
    } catch (e: NumberFormatException) {
        println("Invalid number format: ${e.message}")
    }
}