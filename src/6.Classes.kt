//declare class & className

//class is a blueprint of an object|create object class Student -> reg number, grade, course
//open modifier allows class to be inherited
open class Shape

//Class inheritance using :
class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}

open class Person {
    open val name: String = "Anonymous"
}

// override keyword is used to override a member of a superclass in a subclass.
// This allows the subclass to provide a specific implementation of a function
// or property that is already defined in its superclass.
class Student : Person() {
    override val name: String = "John"
}

//with parameters
class Contact(val id: Int, var email: String) {
    val category: String = ""
}

//with default parameters
class Contact1(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}

//Create instance using constructor
//definition constructor a special type of function called to create an object
class Contact2(val id: Int, var email: String)

//Member functions must be declared within class
class Contact3(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

//Declaring properties
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street

    return result
}

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main() {

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
    //14

    val student = Student()
    println(student.name)  // Outputs: John

    //contact is an instance of the Contact class.
    val contact = Contact2(1, "mary@gmail.com")

    //Access properties
    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com
    // Updates the value of the property: email
        contact.email = "jane@gmail.com"
    // Prints the new value of the property: email
        println(contact.email)
    // jane@gmail.com

    //concatenate
    println("Their email address is: ${contact.email}")

    // Calls member function printId()
    val id = Contact3(1, "mary@gmail.com")

   // Calls member function printId()
    id.printId()
// 1
}
