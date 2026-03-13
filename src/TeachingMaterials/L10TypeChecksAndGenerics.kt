package TeachingMaterials

fun checkType(value: Any) {
    when (value) {
        is String -> println("It's a String")
        is Int -> println("It's an Int")
        is Double -> println("It's a Double")
        else -> println("Unknown type")
    }
}

fun <T> printList(list: List<T>) {
    for (item in list) {
        println(item)
    }
}

fun main() {
    checkType("Hello")
    checkType(42)
    checkType(3.14)

    val stringList = listOf("Apple", "Banana", "Cherry")
    printList(stringList)

    val intList = listOf(1, 2, 3, 4, 5)
    printList(intList)
}
