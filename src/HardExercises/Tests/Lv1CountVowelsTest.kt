package HardExercises.Tests

import HardExercises.Lv1CountVowels
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv1CountVowelsTest {

    private val lv1CountVowels = Lv1CountVowels()

    @Test
    fun `countVowels should return correct vowel count`() {
        val result = lv1CountVowels.countVowels("programming")

        assertEquals(3, result)
    }

    @Test
    fun `countVowels should return zero when no vowels`() {
        val result = lv1CountVowels.countVowels("rhythm")

        assertEquals(0, result)
    }

    @Test
    fun `countVowels should count uppercase vowels`() {
        val result = lv1CountVowels.countVowels("AEIOU")

        assertEquals(5, result)
    }
}