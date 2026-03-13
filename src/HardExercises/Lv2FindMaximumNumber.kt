package HardExercises

class Lv2FindMaximumNumber {

    // TODO
    // Given an integer array, write a function to find the maximum number.
    // Example:
    // Input: [3, 7, 2, 9, 5]
    // Output: 9

    fun findMaximumNumber(numbers: IntArray): Int {
        var max = numbers[0]

        for (num in numbers) {
            if (num > max) {
                max = num
            }
        }

        return max
    }
}