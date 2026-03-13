package HardExercises.Tests

import HardExercises.Lv3CharacterFrequencyCounter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv3CharacterFrequencyCounterTest {

    private val counter = Lv3CharacterFrequencyCounter()

    @Test
    fun `should count character frequency correctly`() {
        val result = counter.countCharacterFrequency("banana")

        assertEquals(1, result['b'])
        assertEquals(3, result['a'])
        assertEquals(2, result['n'])
    }

    @Test
    fun `should work with single character`() {
        val result = counter.countCharacterFrequency("aaaa")

        assertEquals(4, result['a'])
    }

    @Test
    fun `should work with empty string`() {
        val result = counter.countCharacterFrequency("")

        assertEquals(0, result.size)
    }
}