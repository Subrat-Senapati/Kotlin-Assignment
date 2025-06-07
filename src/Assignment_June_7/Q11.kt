package Assignment_June_7

fun main(){
    var strength = 0
    println("Brewing coffee...")
    while (strength < 80) {
        println("Brewing... Strength is $strength")
        strength += 10
    }
    println("Coffee is ready! Final strength: $strength")
}