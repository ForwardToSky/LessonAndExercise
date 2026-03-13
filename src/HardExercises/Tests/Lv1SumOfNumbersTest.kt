package HardExercises.Tests

import HardExercises.Lv1SumOfNumbers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv1SumOfNumbersTest {
    private val lv1SumOfNumbers = Lv1SumOfNumbers()

    @Test
    fun `sumNumbers should return correct sum for 5`() {
        val result = lv1SumOfNumbers.sumNumbers(5)

        assertEquals(15, result)
    }

    @Test
    fun `sumNumbers should return 1 when input is 1`() {
        val result = lv1SumOfNumbers.sumNumbers(1)

        assertEquals(1, result)
    }

    @Test
    fun `sumNumbers should return correct sum for 10`() {
        val result = lv1SumOfNumbers.sumNumbers(10)

        assertEquals(55, result)
    }
}