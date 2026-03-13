package HardExercises

class Lv2PalindromeChecker {

    // TODO
    // Write a function that checks whether a string is a palindrome.
    // A palindrome reads the same forward and backward.
    // Example:
    // Input: "madam"
    // Output: true

    fun isPalindrome(text: String): Boolean {
        val reversed = text.reversed()
        return text == reversed
    }
}