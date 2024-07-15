fun main() {
    //sampleStart

    //map key to value

// Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
// [100, 190, 100]

    println("orange" in readOnlyJuiceMenu.keys)
// true
    println(200 in readOnlyJuiceMenu.values)
// false


    //indexed operator
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    //keyword
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    println(readOnlyJuiceMenu.containsKey("kiwi"))

// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    //keywords
    juiceMenu.put("coconut", 150)
    juiceMenu.remove("orange")

    //casting
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)
// {apple=100, kiwi=190, orange=100}

    //Exercise

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")

//sampleEnd
}
