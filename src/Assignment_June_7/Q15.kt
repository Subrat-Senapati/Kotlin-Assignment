package Assignment_June_7

fun main(){
    var inventory = 10
    println("Counting down coffee inventory:")
    do {
        println("Inventory left: $inventory cup(s)")
        inventory--
    } while (inventory >= 1)
}