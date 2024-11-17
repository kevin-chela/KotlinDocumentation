fun main() {

//sampleStart

    //map key to value

   // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    println(readOnlyJuiceMenu.keys)  // [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)  // [100, 190, 100]

    println("orange" in readOnlyJuiceMenu.keys)  // true
    println(200 in readOnlyJuiceMenu.values)  // false

    //indexed operator
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    //keyword
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs") //This map has 3 key-value pairs
    println(readOnlyJuiceMenu.containsKey("kiwi")) //true

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)

    //keywords
    juiceMenu.put("coconut", 150)
    juiceMenu.remove("orange") //{apple=100, kiwi=190, coconut=150}

    //casting
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)  // {apple=100, kiwi=190, orange=100}

    //Builder function  – buildList(), buildSet(), or buildMap().

    val map = buildMap { // this is MutableMap<String, Int>, types of key and value are inferred from the `put()` calls below
        put("a", 1)
        put("b", 0)
        put("c", 4)
    }
    println(map) // {a=1, b=0, c=4}

    //Empty Collections : emptyList(), emptySet(), and emptyMap().

    val empty = emptyMap<String, String>()

    //Exercise

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'") //2 is spelt as 'two'

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap == anotherMap}") //The maps are equal: true

    println("All keys: ${numbersMap.keys}") //All keys: [key1, key2, key3, key4]
    println("All values: ${numbersMap.values}") //All values: [1, 2, 3, 1]
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}") //Value by key "key2": 2
    if (1 in numbersMap.values) println("The value 1 is in the map") //The value 1 is in the map
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") //The value 1 is in the map

    val numbersMap1 = mutableMapOf("one" to 1, "two" to 2)

    mutableMapOf<String, String>().apply { this["one"] = "1"; this["two"] = "2" }

    numbersMap1.put("three", 3)
    numbersMap1["one"] = 11
    println(numbersMap1) //{one=11, two=2, three=3}

//sampleEnd
}
