package Ejercicio1

/*ERROR
fun Ejercicio3.main() {
    val contador = 0 // En esta variable al asignarla como val el
                // contador es inmutable por lo que no se hará la sumatoria.

            for (i in 1..5) {
                contador = contador + i
            }
    println("Suma: $contador")

 */
//Corrección
fun main() {
    var contador = 0
    for (i in 1..5) {
        contador = contador + i
    }
    println("Suma: $contador")
    corregido()
    listaCorregida()
    suma()
}

/*Error
    var apellido: String = null R//  Arrojaria un error ya que no se utiliza
                   el null safety , y mostrará el error ya que un String no puede ser nulo

    println(apellido.length)     // En esta parte se debe utilizar ? (null safety)

 */

//Correccion
fun corregido(){
    var apellido: String? = null
    println(apellido?.length)
}

/* Error
    val numeros = listOf(1, 2, 3) // La lista está como inmutable por tanto no agrega nuevos valores
    numeros.add(4)
 */
fun listaCorregida() {
    var numeros: MutableList<Int> = mutableListOf(1, 2, 3)
    numeros.add(4)
    for (i in numeros) {
        println(i)
    }
}
/* Error
     val texto = "42"En esta variable al asignarla como val el      contador es inmutable
                        por lo que no se hará la sumatoria.
     val total: Int = texto + 8 R// Se está operando un String con un entero
      println(total)
}
 */

//CORRECION
fun suma() {
    val numero1 = 42 //R//

    val suma: Int = numero1 + 8
    print(suma)

}
