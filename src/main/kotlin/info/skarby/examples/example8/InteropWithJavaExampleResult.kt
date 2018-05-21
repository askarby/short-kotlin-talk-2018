package info.skarby.examples.example8

fun main(args: Array<String>) {

    val address = Address("Paradisæblevej", "54a", 8000, "Aarhus C")
    address.country = "Danmark"
    println("""
        |${address.streetName} ${address.streetNumber}
        |${address.postalCode} ${address.city}
        |${address.country}
        """.trimMargin())
}

