package Assignment_June_7

fun main(){
    val orderName = "Latte"
    if (orderName.length >= 5) {
        println("Order name '$orderName' is accepted – nice and descriptive!")
    } else {
        println("Order name '$orderName' is too short – please be more specific!")
    }
}