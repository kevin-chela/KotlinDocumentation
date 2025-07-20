//import libraries
import kotlin.math.PI

//All functions
//A function is a set of instructions that performs a specific task

//Normal function with return statement
fun hello() {
    return println("Hello, world!")
}

//Return type :
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun double(x: Int): Int {
    return 2 * x
}

//Single-expression
fun add(x: Int, y: Int) = x + y

//Lambda expression
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

//Named Arguments|Parameters
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

//Default parameter values
fun printMessageWithDefaultPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//Without return
fun printMessage(message: String) {
    println(message)
// `return Unit` or `return` is optional
}

//Exercise
fun circleArea(radius: Int): Double {
    return PI * radius * radius
}

//Rewrite as a single expression
fun circleAreas(radius: Int): Double = PI * radius * radius

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds

fun main() {

    //Invoke all functions

    hello()
    // Hello, world!

    println(sum(1, 2))
    // 3

    println(add(1, 2))
    // 3

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello

    //Default parameter
    printMessageWithDefaultPrefix("Hello")
    // [Info] Hello

    printMessage("Hello")
    // Hello

    println(circleArea(2)) // 12.566370614359172

}

//A higher-order function is a function that takes functions as parameters, or returns a function.
