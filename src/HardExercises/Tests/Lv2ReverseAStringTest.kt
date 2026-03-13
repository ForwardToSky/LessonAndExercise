package HardExercises.Tests

import HardExercises.Lv2ReverseAString
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv2ReverseAStringTest {

    private val lv2ReverseAString = Lv2ReverseAString()

    @Test
    fun `should reverse a normal string`() {
        val result = lv2ReverseAString.reverseString("hello")

        assertEquals("olleh", result)
    }

    @Test
    fun `should reverse a single character`() {
        val result = lv2ReverseAString.reverseString("a")

        assertEquals("a", result)
    }

    @Test
    fun `should reverse a longer string`() {
        val result = lv2ReverseAString.reverseString("programming")

        assertEquals("gnimmargorp", result)
    }
}