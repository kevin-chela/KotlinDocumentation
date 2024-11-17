fun main() {
//sampleStart

    //Check number within a range
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range") //fits in range
    }

    //Out of range
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range") //-1 is out of range
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too") //list size is out of valid list indices range, too
    }

    //Iterate
    for (x in 1..5) {
        print(x) //12345
    }
    println()
    //Over a progression
    for (x in 1..10 step 2) {
        print(x) //13579
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x) //9630
    }



//sampleEnd
}
