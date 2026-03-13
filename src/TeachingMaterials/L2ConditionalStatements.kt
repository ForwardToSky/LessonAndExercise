package TeachingMaterials

fun main() {
    // Conditional Statements in Kotlin

    val number = 10

    if (number > 0) {
        println("Number is positive")
    } else if (number < 0) {
        println("Number is negative")
    } else {
        println("Number is zero")
    }

    // When Expression
    when (number) {
        0 -> println("Number is zero")
        in 1..10 -> println("Number is between 1 and 10")
        else -> println("Number is outside the range")
    }
}
