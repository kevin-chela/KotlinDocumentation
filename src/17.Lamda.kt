fun uppercaseString(text: String): String {
    return text.uppercase()
}

//Return from a function
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

//Exercise
fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) { action() }
}

fun main() {

    repeatN(5) { println("Hello") } //Hello*5

    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")  // Total time is 1680 secs

    println(uppercaseString("hello"))  // HELLO

    //lambda expression
    //Invoke separately
    println({ text: String -> text.uppercase() }("hello")) //HELLO
    println("hello".uppercase())  // HELLO

    //Assign to variable

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello")) // HELLO

    //Pass to another function

    //filter function passed from lambda expression

    //sampleStart
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    //shorter lambda
    val positive = numbers.filter { it > 0 }

    val negatives = numbers.filter { x -> x < 0 }
    println(positives)  // [1, 3, 5]
    println(negatives)  // [-2, -4, -6]

//sampleEnd

    //using map function

    //sampleStart
    val numbers1 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers1.map { x -> x * 2 }
    val tripled = numbers1.map { it * 3 }
    println(doubled)  // [2, -4, 6, -8, 10, -12]
    println(tripled)  // [3, -6, 9, -12, 15, -18]

//sampleEnd

   // Function types
    val upperCaseString1: (String) -> String = { text -> text.uppercase() }

    //won't work uncomment to see
    //val upperCaseString2 = { str -> str.uppercase() }

    //Trailing lambdas
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // 6

//Exercise

    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action
        -> "$prefix/$id/$action" }
    println(urls)  //URL: https://example.com/book-info/5/title

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) } //APPLE AVOCADO

    }