//Return on when statement
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        "Yellow" -> 3
        "Purple" -> 4
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun main(){

    //Change string parameter "Red" to "Pink"
    val redValue = transform("Red")
    val greenValue = transform("Green")
    val blueValue = transform("Blue")

    println("Red: $redValue")   // Output: Red: 0
    println("Green: $greenValue") // Output: Green: 1
    println("Blue: $blueValue")  // Output: Blue: 2

    //try catch block expression
    try {
        val unknownValue = transform("Yellow")
    } catch (e: IllegalArgumentException) {
        println(e.message) // Output: Invalid color param value
    }
}