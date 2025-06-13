package Assignment_June_13

fun main(){
    handleMultipleExceptions()
}

fun handleMultipleExceptions() {
    try {
        val list: List<String>? = null
        println(list!!.get(0))

        val nums = listOf(1, 2, 3)
        println(nums[5])
    } catch (e: NullPointerException) {
        println("Caught NullPointerException: ${e.message}")
    } catch (e: IndexOutOfBoundsException) {
        println("Caught IndexOutOfBoundsException: ${e.message}")
    }
}