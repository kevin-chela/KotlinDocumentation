import java.util.*
import kotlin.collections.HashSet

fun main() {
//sampleStart

    //definition lists are ordered and allow duplicate items

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
// [triangle, square, circle]

    //indexed access operator
    println("The first item in the list is: ${readOnlyShapes[0]}")

    //keywords .first()|.last()
    println("The first item in the list is: ${readOnlyShapes.first()}")

    //keyword .count()
    println("This list has ${readOnlyShapes.count()} items")



// Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    //keyword .add()
    shapes.add("pentagon")
    println(shapes)

    //keyword .remove()
    shapes.remove("pentagon")
    println(shapes)

    //casting to obtain readonly on mutableList
    val shapesLocked: List<String> = shapes
    println(shapesLocked)
// [triangle, square, circle]

    //Exercise1

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)

    val items = listOf("apple", "banana", "kiwifruit")

    for (item in items) {
        println(item)
    }

    //check presence of elements not case-sensitive

    println("apple" in items)

    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

    val numbers1 = mutableListOf(1, 2, 3, 4)
    numbers1.add(5)
    numbers1.removeAt(1)
    numbers1[0] = 0
    numbers1.shuffle()
    println(numbers1)

    //Initializer functions

    val doubled = List(3, { it * 2 }) // or MutableList if you want to change its content later
    println(doubled)

    //Concrete type constructor

    val linkedList = LinkedList<String>(listOf("one", "two", "three"))
    val presizedSet = HashSet<Int>(32)

//sampleEnd
}
