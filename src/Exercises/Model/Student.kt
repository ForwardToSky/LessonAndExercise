package Exercises.Model

data class Student(
    val studentId: Int,
    val name: String,
    val age: Int,
    val gender: String,
    val gpa: Double,
    val isActive: Boolean = false,
    val phoneNumber: String,
    val program: String = ""
)