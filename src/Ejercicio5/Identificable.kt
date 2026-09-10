package Ejercicio5

interface Identificable {
    val nombre: String
    val identificacion: String

    fun resumenIdentidad(): String {
        return "Nombre: $nombre, Identificación: $identificacion"
    }
}