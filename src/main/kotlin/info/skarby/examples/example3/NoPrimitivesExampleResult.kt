package info.skarby.examples.example3

fun main(args: Array<String>) {
    val characters = arrayOf('a', 'b', 'c', '1')
    for (character in characters) {
        println("Character $character ${if (character.isDigit()) "is" else "is not" } a digit")
    }
}