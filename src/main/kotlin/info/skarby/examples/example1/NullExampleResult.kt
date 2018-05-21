package info.skarby.examples.example1

import java.util.*

fun main(args: Array<String>) {
    println("What's your age? > ")
    val scanner = Scanner(System.`in`)
    var age: Int? = null

    try {
        age = Integer.parseInt(scanner.nextLine())
    } catch (e: NumberFormatException) {
        // Ignore this
    }

    println("Your age is ${age ?: "unknown"}")
}