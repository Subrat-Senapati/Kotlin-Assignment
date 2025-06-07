package Assignment_June_7

fun main(){
    println("Coffee Orders (Skipping Decaf):")
    for (i in 1..10) {
        if (i % 3 == 0) {
            println("Order #$i is decaf – skipping...")
            continue
        }
        println("Order #$i: Regular coffee served.")
    }
}