package HardExercises

class Lv3PrimeNumberChecker {

    // TODO
    // Write a function that checks whether a number is a prime number.
    // A prime number is a number greater than 1 that has no divisors other than 1 and itself.
    // Example:
    // Input: 7
    // Output: true

    fun isPrime(number: Int): Boolean {

        if (number <= 1) {
            return false
        }

        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }

        return true
    }
}