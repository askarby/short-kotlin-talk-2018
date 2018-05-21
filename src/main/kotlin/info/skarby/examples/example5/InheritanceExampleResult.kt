package info.skarby.examples.example5

fun main(args: Array<String>) {
    val animals = arrayOf(Dog(), Cat())

    for (animal in animals) {
        println("I'm a " + animal.javaClass.simpleName)
        animal.breathe()
        animal.makeSound()
        if (animal is Cat) {
            animal.ignore()
        } else if (animal is Dog) {
            animal.drool()
        }
        println()
    }
}

abstract class KotlinAnimal {
    fun breathe() {
        println("[Takes a breath]")
    }

    abstract fun makeSound()
}

class KotlinDog: KotlinAnimal() {
    override fun makeSound() {
        println("[Makes the sound] Wooof!")
    }

    fun drool() {
        println("[Drools]")
    }
}

class KotlinCat: KotlinAnimal() {
    override fun makeSound() {
        println("[Makes the sound] miiiaaaaauuwww!")
    }

    fun ignore() {
        println("[Ignores you]")
    }

}

