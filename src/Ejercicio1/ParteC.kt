package Ejercicio1

fun main() {
    calificarNota(2.0)
}
private fun calificarNota(nota: Double) {
    val resultado: String = if (nota >= 4.5) {
        "Excelente"
    } else if (nota >= 3.0) {
        "Aprobo"
    } else {
        "Perdio"
    }
    print(resultado)
}