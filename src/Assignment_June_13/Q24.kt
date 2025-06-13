package Assignment_June_13

fun main(){
    try {
        checkAge(16)
    }catch(e: Exception){
        println(e.message)
    }
}

class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older.")
    }
    println("Access granted for age $age")
}