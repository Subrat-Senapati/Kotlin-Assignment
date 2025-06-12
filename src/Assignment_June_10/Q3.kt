package Assignment_June_10

fun main(){
    val name: String? = "Hello"
    name?.let {
        println("Uppercase name: ${it.uppercase()}")
    }
}