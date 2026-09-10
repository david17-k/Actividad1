package Ejercicio5

class Paciente(
    nombre: String,
    identificacion: String,
    genero: Genero,
    val telefono: String,
    val direccion: Direccion
) : Persona(nombre, identificacion, genero)