package Assignment_June_8

fun main() {
    val studentMarks = mapOf("Ravi" to 85, "Ajay" to 65, "Sneha" to 92, "Kiran" to 70)

    for ((name, mark) in studentMarks) {
        if (mark > 75) {
            println(name)
        }
    }
}
