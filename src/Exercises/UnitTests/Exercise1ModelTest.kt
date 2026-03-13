package Exercises.UnitTests

import Exercises.Functions.Exercise1ModelFunction
import Exercises.Model.Student
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

// can reference to L6Loop - Inheritance section, and reference to ScopeFunction
// Using the function located on src/Exercise/Function/ModelAssignmentFunction
class Exercise1ModelTest {

    private val modelAssignmentFunction = Exercise1ModelFunction()

    @Test
    fun `assignStudentModel should return correct Student`() {

        // Arrange
        val studentId = 1
        val name = "Sky"
        val age = 22
        val gender = "Male"
        val gpa = 3.8
        val isActive = true
        val phoneNumber = "0123456789"
        val program = "Computer Science"

        // Act
        val result = modelAssignmentFunction.createAndGetStudent(
            studentId = studentId,
            name = name,
            age = age,
            gender = gender,
            gpa = gpa,
            isActive = isActive,
            phoneNumber = phoneNumber,
            program = program
        )

        // Assert
        assertNotEquals(result.isActive, false, "isActive cannot be false")
        assertNotEquals(result.program, "", "program is missing")
    }
}