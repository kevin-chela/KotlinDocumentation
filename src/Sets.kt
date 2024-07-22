fun main() {
//sampleStart
    //definition sets are unordered and only store unique items

//construct element
    val numbersSet = setOf("one", "two", "three", "four")
    val emptySet = mutableSetOf<String>()


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


    val items = setOf("apple", "banana", "kiwifruit")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

 // LinkedHashSet is the default implementation

    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())


//sampleEnd
}
