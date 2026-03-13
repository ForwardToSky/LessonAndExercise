package HardExercises

class Lv1CountVowels {

    // Write a function that counts the number of vowels in a string.
    // Vowels are: a, e, i, o, u
    // Example:
    // Input: "programming"
    // Output: 3
    fun countVowels(text: String): Int {
        var count = 0

        for (char in text.lowercase()) {
            if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
                count++
            }
        }

        return count
    }
}