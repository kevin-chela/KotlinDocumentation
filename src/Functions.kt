import kotlin.math.PI

//All functions

fun hello() {
    return println("Hello, world!")
}

//Return type

fun sum(x: Int, y: Int): Int {
    return x + y
}

//Single-expression

fun sum1(x: Int, y: Int) = x + y

//Named Arguments

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

//Default parameter values

fun printMessageWithPrefix1(message: String, prefix: String = "Info") {
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

fun circleArea1(radius: Int): Double = PI * radius * radius

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds

fun main() {

    //Invoke all functions

    hello()
// Hello, world!

    println(sum(1, 2))
// 3

    println(sum1(1, 2))
// 3

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
// [Log] Hello

    printMessageWithPrefix1("Hello")
// [Info] Hello

    printMessage("Hello")
// Hello

    println(circleArea(2)) // 12.566370614359172

}
