package TeachingMaterials

fun main() {
    // Functions in Kotlin

    val result = add(5, 3)
    println("Result of add function: $result")

    val greeting = greet("Alice")
    println("Greeting: $greeting")
}

// Function to add two numbers
fun add(a: Int, b: Int): Int {
    return a + b
}

// Function to greet a person
fun greet(name: String): String {
    return "Hello, $name!"
}
