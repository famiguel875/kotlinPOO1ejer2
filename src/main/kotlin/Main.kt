fun main() {

    val persona1 = obtenerDatosPersona()
    val persona2 = obtenerDatosPersona()
    val persona3 = obtenerDatosPersona()

    println(persona1)
    println(persona2)
    println(persona3)

    print("Introduce el nuevo nombre para la Persona 1: ")
    val nuevoNombre = readLine()?.takeIf { it.isNotEmpty() }
    if (nuevoNombre != null) {
        persona1.nombre = nuevoNombre
        println("Nombre modificado: ${persona1.nombre}")
        println("Nombre, peso y altura de la Persona 1: ${persona1.nombre}, ${persona1.peso} kg, ${persona1.altura} m")
    }

    println("Peso, altura e IMC de la Persona 3: ${persona3.peso} kg, ${persona3.altura} m, ${persona3.imc}")

    print("Introduce la nueva altura para la Persona 3 (en metros): ")
    val nuevaAltura = readLine()?.toDoubleOrNull() ?: 0.0
    persona3.altura = nuevaAltura
    println("Después de modificar la altura de la Persona 3:")
    println("Peso, altura e IMC de la Persona 3: ${persona3.peso} kg, ${persona3.altura} m, ${persona3.imc}")

    persona2.altura = persona3.altura

    println("Persona 2: $persona2")
    println("Persona 3: $persona3")

    val sonIguales = persona2 == persona3
    println("¿Persona 2 es igual a Persona 3? $sonIguales")
}
