package Assignment_June_13

fun main(){
    val items = listOf("Apple", "Banana", "Cherry")
    items.forEachIndexed { index, item ->
        println("Index $index: $item")
    }
}