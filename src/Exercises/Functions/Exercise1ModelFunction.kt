package Exercises.Functions

import Exercises.Model.Student

class Exercise1ModelFunction
{
    // todo: there is a missing assignment, you are require to assign the missing value on here
    fun createAndGetStudent(studentId: Int,
                            name: String,
                            age: Int,
                            gender: String,
                            gpa: Double,
                            isActive: Boolean,
                            phoneNumber: String,
                            program: String): Student {
        return Student(
            studentId = studentId,
            name = name,
            age = age,
            gender = gender,
            gpa = gpa,
            phoneNumber = phoneNumber
        )
    }
}