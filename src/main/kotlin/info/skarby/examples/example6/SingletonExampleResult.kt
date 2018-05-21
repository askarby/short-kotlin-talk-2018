package info.skarby.examples.example6

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(Counter.increment())
    }
}

object Counter {
    var count = 0;

    fun increment(): Int {
        return ++this.count;
    }
}