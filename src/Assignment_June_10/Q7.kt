package Assignment_June_10

fun main(){
    val token: String? = "abc123"
    token?.run {
        println("Token is valid: $this")
    }
}