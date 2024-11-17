fun main() {

//sampleStart

    //use of range
    for (number in 1..5) {
    // number is the iterator and 1..5 is the range
        print(number) // 12345
    }

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // Yummy, it's a carrot cake!
    // Yummy, it's a cheesecake!
    // Yummy, it's a chocolate cake!

    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    //    item at 0 is apple
    //    item at 1 is banana
    //    item at 2 is kiwifruit

//sampleEnd

}
