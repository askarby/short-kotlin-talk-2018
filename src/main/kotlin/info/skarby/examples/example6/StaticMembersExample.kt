package info.skarby.examples.example6

fun main(args: Array<String>) {
    val john = KPerson.fromFullName("John P. Doe")
    println("First name(s): ${john.firstName}, last name: ${john.lastName}")
}

data class KPerson(val firstName: String, val lastName: String) {
    companion object {
        fun fromFullName(fullName: String): KPerson {
            val firstName = fullName.substringBeforeLast(' ')
            val lastName = fullName.substringAfterLast(' ')
            return KPerson(firstName, lastName)
        }
    }
}