package Assignment_June_8

fun longestString(words: List<String>): String {
    var longest = ""
    for (word in words) {
        if (word.length > longest.length) {
            longest = word
        }
    }
    return longest
}

fun main() {
    val list = listOf("cat", "elephant", "dog", "giraffe")
    println("Longest word: ${longestString(list)}")
}
