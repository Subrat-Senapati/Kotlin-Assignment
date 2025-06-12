package Assignment_June_10

class MathUtils {
    companion object {
        fun square(n: Int): Int {
            return n * n
        }
    }
}

fun main() {
    println("Square of 4: ${MathUtils.square(4)}")
}