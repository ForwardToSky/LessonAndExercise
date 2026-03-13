package Exercises.UnitTests

import Exercises.Functions.Exercise2AddArrayFunction

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

// can reference to L6Loop - Inheritance section, and reference to ScopeFunction
// Using the function located on src/Exercise/Function/ModelAssignmentFunction
class Exercise2AddArrayTest {

    private val addArrayFunction = Exercise2AddArrayFunction()

    @Test
    fun `CreateAndGetStudentModelArray should return at least 3 students`() {
        // Arrange & Act
        val result = addArrayFunction.CreateAndGetStudents()

        // Assert
        assertNotNull(result, "Student list should not be null")
        assertTrue(result.isNotEmpty(), "Student list should not be empty")
        assertTrue(result.size > 10, "Student list must contain at least 11 students")
    }
}