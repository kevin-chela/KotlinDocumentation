fun main() {
//sampleStart
    //definition sets are unordered and only store unique items

// Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    //keyword as used in file lists.kt apply

// Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    //Casting mutableSet to readonly
    val fruitLocked: Set<String> = fruit
    println(fruitLocked)
// [apple, banana, cherry]

    //Exercise

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")

//sampleEnd
}
