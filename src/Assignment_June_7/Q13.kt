package Assignment_June_7

fun main(){
    println("Coffee Discount Table:")
    val originalPrice = 100
    for (discount in 10..50 step 10) {
        val discountedPrice = originalPrice - (originalPrice * discount / 100)
        println("$discount% off: $discountedPrice Rupees")
    }
}