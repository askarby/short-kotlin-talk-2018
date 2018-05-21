package info.skarby.examples.example2

import java.util.*

fun main(args: Array<String>) {
    println("What's your age? > ")
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val age = try {
        Integer.parseInt(input)
    } catch (e: NumberFormatException) {
        0
    }
    println("Your age is $age! (0 if invalid input)")
}