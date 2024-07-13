//declare class & className
class Classes {
    //class is a blueprint of an object

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
//definition a special type of function called to create an object

class Contact2(val id: Int, var email: String)

//Member functions declared within class

class Contact3(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}


fun main() {

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
    val contact4 = Contact3(1, "mary@gmail.com")

   // Calls member function printId()
    contact4.printId()
// 1
}
