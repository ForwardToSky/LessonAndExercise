package TeachingMaterials

fun String.addExclamation(): String {
    return this + "!"
}

fun main() {
    val greeting = "Hello"
    println(greeting.addExclamation()) // Output: Hello!
}
