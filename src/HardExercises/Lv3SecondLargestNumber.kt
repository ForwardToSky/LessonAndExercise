package HardExercises

class Lv3SecondLargestNumber {

    // TODO
    // Given an integer array, write a function to find the second largest number.
    // Example:
    // Input: [4, 8, 2, 9, 5]
    // Output: 8

    fun findSecondLargest(numbers: IntArray): Int {

        var largest = Int.MIN_VALUE
        var secondLargest = Int.MIN_VALUE

        for (num in numbers) {
            if (num > largest) {
                secondLargest = largest
                largest = num
            } else if (num > secondLargest && num != largest) {
                secondLargest = num
            }
        }

        return secondLargest
    }
}