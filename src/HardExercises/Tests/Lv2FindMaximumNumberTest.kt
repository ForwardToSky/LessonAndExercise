package HardExercises.Tests

import HardExercises.Lv2FindMaximumNumber
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv2FindMaximumNumberTest {

    private val lv2FindMaximumNumber = Lv2FindMaximumNumber()

    @Test
    fun `should find the maximum number in array`() {
        val result = lv2FindMaximumNumber.findMaximumNumber(intArrayOf(3, 7, 2, 9, 5))

        assertEquals(9, result)
    }

    @Test
    fun `should work with negative numbers`() {
        val result = lv2FindMaximumNumber.findMaximumNumber(intArrayOf(-10, -3, -5, -1))

        assertEquals(-1, result)
    }

    @Test
    fun `should return the only element when array has one item`() {
        val result = lv2FindMaximumNumber.findMaximumNumber(intArrayOf(42))

        assertEquals(42, result)
    }
}