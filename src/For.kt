fun main() {
//sampleStart

    //use of range

    for (number in 1..5) {
// number is the iterator and 1..5 is the range
        print(number)
    }
// 12345

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

// Yummy, it's a carrot cake!
// Yummy, it's a cheesecake!
// Yummy, it's a chocolate cake!
    
//sampleEnd
}
