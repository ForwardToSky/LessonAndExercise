package HardExercises.Tests

import HardExercises.Lv3SecondLargestNumber
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv3SecondLargestNumberTest {

    private val finder = Lv3SecondLargestNumber()

    @Test
    fun `should find second largest number`() {
        val result = finder.findSecondLargest(intArrayOf(4, 8, 2, 9, 5))

        assertEquals(8, result)
    }

    @Test
    fun `should work with sorted array`() {
        val result = finder.findSecondLargest(intArrayOf(1, 2, 3, 4, 5))

        assertEquals(4, result)
    }

    @Test
    fun `should work with negative numbers`() {
        val result = finder.findSecondLargest(intArrayOf(-10, -5, -3, -1))

        assertEquals(-3, result)
    }
}