package TeachingMaterials

import TeachingMaterials.models.*

fun main() {
    // OOP in Kotlin
    // Creating an instance of a class
    val person = Person("John", 30)
    println("Person Name: ${person.name}, Age: ${person.age}")

    // Inheritance
    val student = Student("Alice", 20, "Computer Science")
    println("Student Name: ${student.name}, Age: ${student.age}, Major: ${student.major}")

    // Encapsulation
    val bankAccount = BankAccount(1000)
    bankAccount.deposit(500)
    println("Bank Account Balance: ${bankAccount.balance}")

    // Collections in Kotlin
    println("\nCollections in Kotlin:")

    // List
    val numbers = listOf(1, 2, 3, 4, 5)
    println("List: $numbers")
    println("Sum of List: ${numbers.sum()}")

    // Set
    val uniqueNumbers = setOf(1, 2, 3, 4, 5, 5)
    println("Set: $uniqueNumbers")

    // Map
    val studentGrades = mapOf("Alice" to 90, "Bob" to 85, "Charlie" to 88)
    println("Map: $studentGrades")
    println("Alice's Grade: ${studentGrades["Alice"]}")

    // Polymorphism
    val animal = Animal()
    animal.makeSound()

    val dog = Dog()
    dog.makeSound()

    val cat = Cat()
    cat.makeSound()

}
