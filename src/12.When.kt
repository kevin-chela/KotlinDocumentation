

fun main() {
//sampleStart
    val obj = "Hello"
    when (obj) {
    // Checks whether obj equals to "1"
        "1" -> println("One")
    // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
    // Default statement
        else -> println("Unknown")
    }

    // Greeting
    //Assign to variable

    val temp = 18
    val description = when {
    // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
    // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
    // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
    // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description) // warm

//sampleEnd

}
