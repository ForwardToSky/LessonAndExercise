package TeachingMaterials

interface Animal {
    fun makeSound()
}

class Dog : Animal {
    override fun makeSound() {
        println("Woof!")
    }
}

class Cat : Animal {
    override fun makeSound() {
        println("Meow!")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.makeSound()
    cat.makeSound()
}
