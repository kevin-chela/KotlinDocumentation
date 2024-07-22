import kotlin.random.Random

//data class
data class Persona(var name: String, var age: Int)

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() = Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {

// data classes which are particularly useful for storing data

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())

    val bob = Persona("Bob", 31)
    val people = listOf(Persona("Adam", 20), bob, bob)
    val people2 = listOf(Persona("Adam", 20), Persona("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

}

