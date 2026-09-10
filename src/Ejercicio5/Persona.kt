package Ejercicio5


open class Persona(
    override val nombre: String,
    override val identificacion: String,
    val genero: Genero,
    val correo: String? = null
) : Identificable {

    init {
        require(nombre.isNotEmpty()) {
            "El nombre no puede estar vacío"
        }
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', identificacion='$identificacion', genero=$genero, correo=$correo)"
    }
}