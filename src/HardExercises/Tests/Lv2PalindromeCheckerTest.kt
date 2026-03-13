package HardExercises.Tests

import HardExercises.Lv2PalindromeChecker
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Lv2PalindromeCheckerTest {

    private val lv2PalindromeChecker = Lv2PalindromeChecker()

    @Test
    fun `should return true for palindrome word`() {
        val result = lv2PalindromeChecker.isPalindrome("madam")

        assertTrue(result)
    }

    @Test
    fun `should return false for non palindrome`() {
        val result = lv2PalindromeChecker.isPalindrome("hello")

        assertFalse(result)
    }

    @Test
    fun `should work for single character`() {
        val result = lv2PalindromeChecker.isPalindrome("a")

        assertTrue(result)
    }
}