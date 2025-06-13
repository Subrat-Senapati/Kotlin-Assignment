package Assignment_June_13

fun main() {
    try {
        validateEmail("userexample.com")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun validateEmail(email: String) {
    if (!email.contains("@")) {
        throw Exception("Invalid email format")
    }
    println("Email is valid")
}