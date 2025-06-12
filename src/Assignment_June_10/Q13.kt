package Assignment_June_10

data class User(val name: String, val email: String)

fun main() {
    val user1 = User("User1", "User1@gmail.com")
    val user2 = User("User2", "User2@gmail.com")
    val user3 = User("User2", "User2@gmail.com")

    println("Users equal: ${user1 == user2}")
    println("Users equal: ${user2 == user3}")
}