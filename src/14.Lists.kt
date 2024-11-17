import java.util.*
import kotlin.collections.HashSet

fun main() {

//sampleStart

    //definition -> lists are ordered and allow duplicate items
    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes) // [triangle, square, circle]

    //indexed access operator
    println("The first item in the list is: ${readOnlyShapes[0]}") //The first item in the list is: triangle

    //keywords .first()|.last()
    println("The first item in the list is: ${readOnlyShapes.first()}") //The first item in the list is: triangle

    //keyword .count()
    println("This list has ${readOnlyShapes.count()} items") //This list has 3 items

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")

    //keyword .add()
    shapes.add("pentagon")
    println(shapes) //[triangle, square, circle, pentagon]

    //keyword .remove()
    shapes.remove("pentagon")
    println(shapes) //[triangle, square, circle]

    //casting to obtain readonly on mutableList
    val shapesLocked: List<String> = shapes
    println(shapesLocked) // [triangle, square, circle]

    //Exercise1

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount) //5

    val items = listOf("apple", "banana", "kiwifruit")

    for (i in items.indices) {
        print("${items[i]} ")
        if (i < items.size - 1) {
            print(", ") //apple , banana , kiwifruit
        }
    }

    println()

    //check presence of elements not case-sensitive
    println("apple" in items) //true

    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}") //Number of elements: 4
    println("Third element: ${numbers.get(2)}") //Third element: three
    println("Fourth element: ${numbers[3]}") //Fourth element: four
    println("Index of element \"two\" ${numbers.indexOf("two")}") //Index of element "two" 1

    val numbers1 = mutableListOf(1, 2, 3, 4)
    numbers1.add(5)
    numbers1.removeAt(1)
    numbers1[0] = 0
    numbers1.shuffle()
    println(numbers1) //[3, 0, 5, 4]

    //Initializer functions
    val doubled = List(3, { it * 2 }) // or MutableList if you want to change its content later
    println(doubled) //[0, 2, 4]

    //Concrete type constructor
    val linkedList = LinkedList<String>(listOf("one", "two", "three"))
    val presizedSet = HashSet<Int>(32)

//sampleEnd

}
