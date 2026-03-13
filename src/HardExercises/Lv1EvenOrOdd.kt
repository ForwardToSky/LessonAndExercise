package HardExercises

class Lv1EvenOrOdd {
    // TODO Question 1 (Easy)
    // Write a program that prints numbers from 1 to 50.
    // If the number is even, print "Even".
    // If the number is odd, print "Odd".
    fun getEvenOrOdd(number: Int): String {
        return if (number % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }
}