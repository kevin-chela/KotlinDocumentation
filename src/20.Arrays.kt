fun main() {

//sampleStart
// Creates an array with values [1, 2, 3]
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())

    // 1, 2, 3// Sums array elements
    println(simpleArray.sum())

    simpleArray.shuffle()
    println(simpleArray.joinToString())

    // Converts to a Set
    println(simpleArray.toSet())

   // Converts to a List
    println(simpleArray.toList())

    //Array deque allows you to add and remove element at the start and end of queue

    val deque = ArrayDeque(listOf(1, 2, 3))

    deque.addFirst(0)
    deque.addLast(4)
    println(deque) // [0, 1, 2, 3, 4]
    println(deque.first()) // 0
    println(deque.last()) // 4
    deque.removeFirst()
    deque.removeLast()
    println(deque) // [1, 2, 3]


//sampleEnd
}
