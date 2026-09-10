package Ejercicio5

class Medico(
    nombre: String,
    identificacion: String,
    genero: Genero,
    val especialidad: Especialidad,
    val salario: Double,
    val anioIngreso: Int
) : Persona(nombre, identificacion, genero) {

    // Constructor secundario
    constructor(
        nombre: String,
        identificacion: String,
        genero: Genero,
        especialidad: Especialidad
    ) : this(
        nombre,
        identificacion,
        genero,
        especialidad,
        3000000.0,
        2026
    )

    fun antiguedad(anioActual: Int = 2026): Int {
        return anioActual - anioIngreso
    }

    override fun resumenIdentidad(): String {
        return "${super.resumenIdentidad()}, Especialidad: $especialidad"
    }
}