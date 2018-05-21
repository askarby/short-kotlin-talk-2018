package info.skarby.examples.example4

fun main(args: Array<String>) {
    val persons = arrayOf(
        KotlinPerson("John", 40),
        KotlinPerson("Jane", 34)
    )
    persons[1].jobTitle = "Banker"
    for (person in persons) {
        println("${person.name} is ${person.age} years old and ${if (person.jobTitle == null) "is unemployed" else ("works as ${person.jobTitle}")}")
    }
}