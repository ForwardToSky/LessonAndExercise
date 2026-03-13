package TeachingMaterials

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("Division by zero is not allowed")
    }
    return a / b
}

fun main() {
    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } finally {
        println("This will always execute")
    }
}
