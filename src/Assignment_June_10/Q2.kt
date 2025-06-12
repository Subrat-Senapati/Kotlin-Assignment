package Assignment_June_10

fun main(){
    val username: String? = "UserName"
    println("Username length: ${getLength(username)}")
}

fun getLength(input: String?): Int {
    return input?.length ?: 0
}