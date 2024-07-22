//Propagating opt-in

// Library code
@RequiresOptIn(message = "This API is experimental. It may be changed in the future without notice.")
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class MyDateTime // Opt-in requirement annotation

@MyDateTime
class DateProvider // A class requiring opt-in

@MyDateTime
fun getDate(): String {
    val dateProvider = DateProvider() // OK: the function requires opt-in as well
    // Simulating getting the date
    return "2024-07-05"
}

// Client code
@OptIn(MyDateTime::class)
fun getYear(): Int {
    val dateProvider = DateProvider() // Now it's OK: we opted-in at the function level
    // Simulating extracting the year from the date
    return 2024
}

fun main() {
    // Opt-in at the call site
    @OptIn(MyDateTime::class)
    fun displayDate() {
        println(getDate()) // Now it's OK: we opted-in at the function level
    }

    displayDate()

    // Another approach is to opt-in at the main function level
    @OptIn(MyDateTime::class)
    fun mainWithOptIn() {
        println(getDate()) // This is also OK: we opted-in at the function level
        println(getYear()) // This is OK as well
    }

    mainWithOptIn()
}


//Non propagating opt in

//Module-wide opt-in
