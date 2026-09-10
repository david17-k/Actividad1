@file:JvmName("Ejercicio3Kt")

package Ejercicio3

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Productos
    val producto1 =Producto("Teclado",45000.0,4)
    val producto2 =Producto("Mouse",60000.0,2)
    val producto3 =Producto("Audifonos",35000.0,5)
    val producto4 =Producto("Pantallas",150000.0,1)
    val producto5 =Producto("Portatiles",3500000.0,0)
    //Lista
    val inventario:List<Producto> =listOf(producto1,producto2,producto3,producto4,producto5)

    println("Precio producto: ${producto3.valorTotal()}")

    println("*****************************************")
    println("Descuento ${aplicarDescuento(producto2,25.0)}")
    println("Ejercicio3.Producto sin descuento: ${producto2}")
    println("Descuento ${aplicarDescuento(producto1)}")
    println("Ejercicio3.Producto sin descuento: ${producto1}")
    println("**************************************")

    //Punto 5

    println(producto5.estaAgotado())


    println(aplicarDescuento(producto1))
    println(aplicarDescuento(producto1, 25.0))
    println(aplicarDescuento(producto1, porcentaje = 25.0))


    println(resumen(inventario))
    listaInventario(inventario)
    println(comparacionProductos())
}

data class Producto(val nombre:String,val precio:Double,val cantidad: Int)



fun Producto.valorTotal (): Double {
    return precio*cantidad
}

fun aplicarDescuento(producto: Producto, porcentaje:Double=0.0): Producto{
    return if (porcentaje==0.0){
        producto.copy(precio =producto.precio-(producto.precio*0.10))
    } else {
        producto.copy(precio =producto.precio-(producto.precio*(porcentaje/100)))
    }
}

fun resumen( productos:List<Producto>): String{
    var resumen: String=""
    resumen+="Inventario (${productos.size})\n"
    productos.forEach{producto ->
        resumen+="- ${producto.nombre}: " +
                "${producto.cantidad} * ${producto.precio}= " +
                "${producto.precio * producto.cantidad}\n"

    }
    resumen+="Total Inventario ${totalInventario(productos)}"
    return resumen
}


fun totalInventario(productos:List<Producto>): Double{
    var total: Double=0.0
    for(producto in productos){
        total+=producto.precio*producto.cantidad
    }
    return total
}

fun Producto.estaAgotado(): Boolean{
    return if(cantidad==0){
        true
    }else{
        false
    }
}

fun listaInventario(inventario: List<Producto>){
    for((nombre,precio)in inventario){
        println("$nombre->$precio")
    }
}

/**********************************************************************************+
  La razón por la cual cuando se comparan los dos productos que comparten los
  mismos atributos es por la implementaciones que posee la clase data como lo son el equals
   que lo sobreescribe y compara los atributos.
 ***********************************************************************************/
fun comparacionProductos(): Boolean{
    val producto1=Producto("Teclado",45000.0,4)
    val producto2=Producto("Teclado",45000.0,4)
    return if(producto1==producto2){
        true
    }else if(producto2===producto1){
        true
    }else
        false
}

