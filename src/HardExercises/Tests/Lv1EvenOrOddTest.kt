package HardExercises.Tests

import HardExercises.Lv1EvenOrOdd
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv1EvenOrOddTest {

    private val lv1EvenOrOdd = Lv1EvenOrOdd()

    @Test
    fun `should return Even when number is even`() {
        val result = lv1EvenOrOdd.getEvenOrOdd(2)

        assertEquals("Even", result)
    }

    @Test
    fun `should return Odd when number is odd`() {
        val result = lv1EvenOrOdd.getEvenOrOdd(3)

        assertEquals("Odd", result)
    }

    @Test
    fun `should return Even for 50`() {
        val result = lv1EvenOrOdd.getEvenOrOdd(50)

        assertEquals("Even", result)
    }
}