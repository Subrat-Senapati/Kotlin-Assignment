package Assignment_June_7

fun main(){
    val coffeePrice = 7.0
    val priceMessage = when {
        coffeePrice < 3 -> "That's a budget brew!"
        coffeePrice in 3.0..6.0 -> "Perfectly priced coffee!"
        else -> "Premium blend! Worth the splash!"
    }
    println("Price Check: $priceMessage")
}