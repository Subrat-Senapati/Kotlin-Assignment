package Assignment_June_13

fun main(){
    println(isPalindrome("madam"))
    println(isPalindrome("hello"))
}

val isPalindrome: (String) -> Boolean = { str ->
    str == str.reversed()
}