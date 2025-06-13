package Assignment_June_13

fun main(){
    val names = listOf("John", "Michael", "Sarah", "Elizabeth", "Tom")
    val count = names.count { it.length > 5 }
    println("Names longer than 5 characters: $count")
}