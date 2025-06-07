package Assignment_June_7

fun main(){
    println("Coffee prices : ")
    for (price in 1..10) {
        if (price % 2 == 0) {
            println("Coffee for $price Rupees")
        }
    }
}