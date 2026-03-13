package Exercises.UnitTests

import Exercises.Functions.Exercise2AddArrayFunction
import Exercises.Functions.Exercise3ConditionalAndLoopsFunction
import Exercises.Model.Student
import org.junit.Assert.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Exercise3ConditionalAndLoopsFunctionTest {

    private lateinit var exerciseFunction: Exercise3ConditionalAndLoopsFunction

    class FakeAddArrayFunction : Exercise2AddArrayFunction() {
        override fun CreateAndGetStudents(): List<Student> {
            return listOf(
                Student(1, "Ali", 20, "Male", 3.2, true, "0121111111", "CS"),
                Student(2, "Siti", 21, "Female", 3.8, true, "0122222222", ""),
                Student(3, "John", 22, "Male", 3.0, false, "0123333333", "SE"),
                Student(4, "Ahmad", 23, "Male", 3.4, true, "0124444444", "IT"),
                Student(5, "Nurul", 20, "Female", 3.9, true, "0125555555", "CS"),
                Student(6, "Jason", 24, "Male", 2.8, false, "0126666666", "IT"),
                Student(7, "Mei Ling", 21, "Female", 3.7, true, "0127777777", "SE"),
                Student(8, "Kumar", 22, "Male", 3.1, true, "0128888888", ""),
                Student(9, "Aisyah", 23, "Female", 3.5, true, "0129999999", "CS"),
                Student(10, "Daniel", 25, "Male", 2.9, false, "0130000000", "IT")
            )
        }
    }

    @BeforeEach
    fun setUp() {
        val fakeAddArrayFunction = FakeAddArrayFunction()
        exerciseFunction = Exercise3ConditionalAndLoopsFunction(fakeAddArrayFunction)
    }

    @Test
    fun `canEnrollInNewCourse should return true when student is active and has program`() {
        // arrange & act
        val result1 = exerciseFunction.canEnrollInNewCourse(1)
        val result2 = exerciseFunction.canEnrollInNewCourse(4)
        val result3 = exerciseFunction.canEnrollInNewCourse(5)
        val result4 = exerciseFunction.canEnrollInNewCourse(7)
        val result5 = exerciseFunction.canEnrollInNewCourse(9)

        // Assert
        assertTrue(result1)
        assertTrue(result2)
        assertTrue(result3)
        assertTrue(result4)
        assertTrue(result5)
    }

    @Test
    fun `canEnrollInNewCourse should return false when student program is empty`() {
        // Arrange & Act
        val result1 = exerciseFunction.canEnrollInNewCourse(2)
        val result2 = exerciseFunction.canEnrollInNewCourse(8)

        // Assert
        assertFalse(result1)
        assertFalse(result2)
    }

    @Test
    fun `canEnrollInNewCourse should return false when student is not active`() {
        // Arrange & Act
        val result1 = exerciseFunction.canEnrollInNewCourse(3)
        val result2 = exerciseFunction.canEnrollInNewCourse(6)
        val result3 = exerciseFunction.canEnrollInNewCourse(10)

        // Assert
        assertFalse(result1)
        assertFalse(result2)
        assertFalse(result3)
    }

    @Test
    fun `canEnrollInNewCourse should return false when student is not exist`() {
        // Arrange & Act
        val result = exerciseFunction.canEnrollInNewCourse(99)

        // Assert
        assertFalse(result)
    }


    @Test
    fun `enterNewCourse should return true when existing student is passed`() {
        // Arrange
        val student = Student(
            studentId = 1,
            name = "Ali",
            age = 20,
            gender = "Male",
            gpa = 3.2,
            isActive = true,
            phoneNumber = "0121111111",
            program = "CS"
        )

        // Act
        val result = exerciseFunction.enterNewCourse(student)

        // Assert
        assertTrue(result)
    }
// todo: i want to mock this function `canEnrollInNewCourse`, continue from here, maybe add on interfaces to each classes
    @Test
    fun `enterNewCourse should return true when non existing student is passed`() {
        // Arrange
        val student = Student(
            studentId = 999,
            name = "Unknown",
            age = 19,
            gender = "Male",
            gpa = 2.0,
            isActive = true,
            phoneNumber = "0111111111",
            program = "IT"
        )

        // Act
        val result = exerciseFunction.enterNewCourse(student)

        // Assert
        assertTrue(result)
    }
}