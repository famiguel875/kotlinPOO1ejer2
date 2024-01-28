class Persona(
    var nombre: String?,
    var peso: Double,
    var altura: Double
) {
    val imc: Double
        get() = peso / (altura * altura)

    constructor(peso: Double, altura: Double) : this(null, peso, altura)

    override fun toString(): String {
        return "Persona [Nombre: $nombre, Peso: $peso kg, Altura: $altura m, IMC: $imc]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (nombre != other.nombre) return false
        if (peso != other.peso) return false
        if (altura != other.altura) return false
        if (imc != other.imc) return false

        return true
    }
}

fun obtenerDatosPersona(): Persona {
    print("Introduce el nombre de la persona: ")
    val nombre = readLine()?.takeIf { it.isNotEmpty() }

    print("Introduce el peso de la persona (en kg): ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0

    print("Introduce la altura de la persona (en metros): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    return Persona(nombre, peso, altura)
}
