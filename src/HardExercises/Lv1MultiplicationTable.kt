package HardExercises

class Lv1MultiplicationTable {

    // TODO
    // Write a program that prints the multiplication table from 1 to 10.
    // Example:
    // 3 x 1 = 3
    // 3 x 2 = 6
    // ...
    // 3 x 10 = 30

    fun generateMultiplicationTable(number: Int): List<String> {
        val result = mutableListOf<String>()

        for (i in 1..10) {
            result.add("$number x $i = ${number * i}")
        }

        return result
    }
}