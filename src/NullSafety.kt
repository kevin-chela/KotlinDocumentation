//Check for null values
fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

//Use safe calls
fun lengthString(maybeString: String?): Int? = maybeString?.length

//Exercise

data class Employee1 (val name: String, var salary: Int)
fun employeeById(id: Int) = when(id) {
    1 -> Employee1("Mary", 20)
    2 -> null
    3 -> Employee1("John", 21)
    4 -> Employee1("Ann", 23)
    else -> null
}
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {

    println((1..5).sumOf { id -> salaryById(id) })

    val nullString: String? = null
    println(describeString(nullString))
// Empty or null string

    val nullString1: String? = null
    println(lengthString(nullString1))
// null

    //invocation to uppercase
    println(nullString?.uppercase())
// null

    //Use Elvis Operator ?: provide default value if null detected
    println(nullString?.length ?: 0)
// 0

// neverNull has String type
    var neverNull: String = "This can't be null"
// Throws a compiler error
//    neverNull = null
// nullable has nullable String type
    var nullable: String? = "You can keep a null here"
// This is OK
    nullable = null
// By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"
// Throws a compiler error
//    inferredNonNull = null
    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull)) // 18
//    println(strLength(nullable)) // Throws a compiler error
}