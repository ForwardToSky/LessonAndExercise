package HardExercises

class Lv1SumOfNumbers {

    // TODO
    // Write a function that calculates the sum of numbers from 1 to n.
    // Example:
    // Input: n = 5
    // Output: 15
    // Because 1 + 2 + 3 + 4 + 5 = 15

    fun sumNumbers(n: Int): Int {
        var sum = 0

        for (i in 1..n) {
            sum += i
        }

        return sum
    }
}