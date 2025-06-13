package Assignment_June_13

fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8)
    val merged = (list1 + list2).distinct()
    println("Merged list without duplicates: $merged")
}