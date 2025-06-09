package Assignment_June_8

fun main() {
    val value: String? = "Kotlin"

    println("Length using ?.: ${value?.length}")

    val length = value?.length ?: -1
    println("Length using ?: $length")

    println("Length using !!: ${value!!.length}")
}
