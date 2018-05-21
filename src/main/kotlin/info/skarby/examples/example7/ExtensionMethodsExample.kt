package info.skarby.examples.example7

fun main(args: Array<String>) {
    val reversed = "Hello".reverse()
    println(reversed)
}

fun String.reverse(): String {
    var reversed = "";
    for (i in this.length - 1 downTo 0) {
        reversed += this[i]
    }
    return reversed;
}