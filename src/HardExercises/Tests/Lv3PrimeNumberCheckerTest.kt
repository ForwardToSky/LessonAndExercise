package HardExercises.Tests

import HardExercises.Lv3PrimeNumberChecker
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Lv3PrimeNumberCheckerTest {

    private val checker = Lv3PrimeNumberChecker()

    @Test
    fun `should return true for prime number`() {
        val result = checker.isPrime(7)

        assertTrue(result)
    }

    @Test
    fun `should return false for non prime number`() {
        val result = checker.isPrime(8)

        assertFalse(result)
    }

    @Test
    fun `should return false for numbers less than 2`() {
        val result = checker.isPrime(1)

        assertFalse(result)
    }
}