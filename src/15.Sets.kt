fun main() {

//sampleStart
    //definition -> sets are unordered and only store unique items
   //construct element
    val numbersSet = setOf("one", "two", "three", "four")
    val emptySet = mutableSetOf<String>()


    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    //similar keywords as used in file lists.kt apply .count, .first

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    //Casting mutableSet to readonly
    val fruitLocked: Set<String> = fruit
    println(fruitLocked) // [apple, banana, cherry]

    //Exercise

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported") //Support for smtp: false

    val items = setOf("apple", "banana", "kiwifruit")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too") //apple is fine too
    }

    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}") //Number of elements: 4
    if (numbers.contains(1)) println("1 is in the set") //1 is in the set
    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}") //The sets are equal: true

    // LinkedHashSet is the default implementation
    println(numbers.first() == numbersBackwards.first()) //false
    println(numbers.first() == numbersBackwards.last()) //true

//sampleEnd

}
