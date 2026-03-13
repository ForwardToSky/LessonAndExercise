package TeachingMaterials

import TeachingMaterials.models.Student

fun main() {
    let()
    run()
    with()
    apply()
    also()
}

fun let(){
    val name: String? = "Sky"

    val result = name?.let {
        println("Name: $it")
        it.length
    }

    println(result)
}

fun run(){
    val result = "Hello".run {
        println(this)
        length
    }

    println(result)
}

fun with() {
    val text = "Hello"

    val result = with(text) {
        println(length)
        uppercase()
    }

    println(result)
}

fun apply(){
    val student = Student(
        "Sky",11,"Math"
    ).apply {
        println("Student name: $name")
    }

    println(student)
}

fun also() {
    val numbers = mutableListOf(1,2,3)

    numbers.also {
        println("Before add: $it")
    }.add(4)

    println(numbers)
}
