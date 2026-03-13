package TeachingMaterials

fun main() {
    // Lambda Expressions in Kotlin

    // Simple Lambda Expression
    val addLambda = { a: Int, b: Int -> a + b }
    println("Result of lambda add: ${addLambda(5, 3)}")

    // Using Lambda Expression with Higher-Order Function
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.sumBy { it }
    println("Sum of numbers: $sum")

    // Using Lambda Expression with Filter
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
}
