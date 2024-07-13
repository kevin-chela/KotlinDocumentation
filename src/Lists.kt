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

//sampleEnd
}
