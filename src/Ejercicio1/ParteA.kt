package Ejercicio1


    fun main() {
        val numero1: Int? = 127
        val numero2: Int? = 127
        println(numero1 == numero2) //Verdadero
        println(numero1 === numero2)//Esta parte se suponia que debia dar falso,ya que lo que compara si es la misma posición en memoria,
        // pero al momento de compilar arrojó que era verdadero,esto debido a Kotlin maneja un mecanismo el
        //  cual consiste en que valores enteros pequeños reutiliza las mismas instancias.

        val c: Int? = 128
        val d: Int? = 128
        println(c == d)// Verdadero
        println(c === d)/* Falso, En este caso al momento de compilar si dio falso esto debido a que el mecanismo que
                          maneja Kotlin abarca desde -128 a 127 de enteros.
                          */


        val nombre: String? = "Juan"
        println(nombre!!.length)

        val texto = "Kotlin"
        val texto2 = StringBuilder("Kot").append("lin").toString()
        println(texto == texto2)//Verdadero, Este al momento de compilarlo si arrojo que era verdadero

        println(texto === texto2)/* Falso, Al momento de compilar arrojó que era falso ya que lo que
                              compara es si estas dos referencias apuntan al mismo objeto en memoria.
                              */

    }


    fun listaA() {
        val nombres: List<String?> = listOf("Castillo", null, "Beatriz")
        for (nombre in nombres) {
            println(nombre!!.length)
        }
    }
    /*
R//  3, -1 , 7.  Cuando se ejecutó arrojó la longitud que de las palabras , en este caso la lista al admitir un valor nulo,
                    arrojó un menos uno al momento de llegar a la posición donde se encontraba el null
     */
    /*Si se cambia la expresión nombre?.length?:-1 por nombre?!!.length cuando llegue a posición donde se encuentra
    el null arrojaría la excepción NullPointerException.
     */
