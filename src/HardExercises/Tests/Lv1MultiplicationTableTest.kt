package HardExercises.Tests

import HardExercises.Lv1MultiplicationTable
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Lv1MultiplicationTableTest {

    private val lv1MultiplicationTable = Lv1MultiplicationTable()

    @Test
    fun `should generate 10 rows`() {
        val result = lv1MultiplicationTable.generateMultiplicationTable(3)

        assertEquals(10, result.size)
    }

    @Test
    fun `first row should be correct`() {
        val result = lv1MultiplicationTable.generateMultiplicationTable(3)

        assertEquals("3 x 1 = 3", result[0])
    }

    @Test
    fun `last row should be correct`() {
        val result = lv1MultiplicationTable.generateMultiplicationTable(3)

        assertEquals("3 x 10 = 30", result[9])
    }

    @Test
    fun `multiplication table for 5 should work`() {
        val result = lv1MultiplicationTable.generateMultiplicationTable(5)

        assertEquals("5 x 5 = 25", result[4])
    }
}