package HardExercises

class Lv3CharacterFrequencyCounter {

    // TODO
    // Write a function that counts the frequency of each character in a string.
    // Example:
    // Input: "banana"
    // Output:
    // b = 1
    // a = 3
    // n = 2

    fun countCharacterFrequency(text: String): Map<Char, Int> {
        val frequencyMap = mutableMapOf<Char, Int>()

        for (char in text) {
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }

        return frequencyMap
    }
}