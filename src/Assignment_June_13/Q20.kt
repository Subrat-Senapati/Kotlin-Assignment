package Assignment_June_13

fun main() {
    try {
        checkName("")
    }catch(e: IllegalArgumentException){
        println(e.message)
    }
}

fun checkName(name: String) {
    if (name.isBlank()) {
        throw IllegalArgumentException("Name cannot be blank.")
    }
    println("Name is valid: $name")
}

