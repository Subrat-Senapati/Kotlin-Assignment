package Assignment_June_13

fun main(){
    val items = mapOf("Laptop" to 700, "Pen" to 20, "Monitor" to 550, "Notebook" to 100)
    val expensiveItems = items.filter { it.value > 500 }
    println("Items costing more than 500: $expensiveItems")
}