fun main() {
//sampleStart

    val d: Int
    val check = true
    d = if (check) {
        1
    } else {
        2
    }
    println(d)
// 1

    val a = 1
    val b = 2
    println(if (a > b) a else b) // Returns a value: 2


//sampleEnd
}
