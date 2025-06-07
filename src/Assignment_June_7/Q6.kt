package Assignment_June_7

fun main(){
    val day = 4
    val coffeeRecommendation = when (day) {
        1 -> "Monday: Start your week with a strong Espresso!"
        2 -> "Tuesday: How about a smooth Latte?"
        3 -> "Wednesday: Go for a rich Cappuccino."
        4 -> "Thursday: A Flat White sounds perfect!"
        5 -> "Friday: Treat yourself with a Mocha!"
        6 -> "Saturday: Time for a sweet Caramel Macchiato."
        7 -> "Sunday: Relax with a decaf Americano."
        else -> "Invalid day! Coffee works best 1–7!"
    }
    println(coffeeRecommendation)
}