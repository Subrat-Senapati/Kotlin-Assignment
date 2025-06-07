package Assignment_June_7

fun main(){
    println("Processing coffee orders:")
    for (i in 1..10) {
        if (i == 5) {
            println("Order #$i: Rush hour!")
            break
        }
        println("Order #$i: Brewing...")
    }
}