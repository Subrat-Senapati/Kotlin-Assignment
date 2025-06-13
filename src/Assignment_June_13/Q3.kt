package Assignment_June_13

fun main(){
    val employees = mapOf("Alice" to "HR", "Bob" to "IT", "Charlie" to "Finance")
    for ((name, department) in employees) {
        println("$name works in $department")
    }
}