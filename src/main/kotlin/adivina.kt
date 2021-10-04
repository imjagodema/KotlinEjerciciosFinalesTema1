import java.lang.NumberFormatException


fun main(){
    val aleatorio=(1..9).random()
var minumero:Int?=0
    println("Encuentra el numero entre 0 y 9")
while (minumero!=aleatorio)
{
    minumero=leernum()
    if (minumero>aleatorio) println("El numero es menor")
    if (minumero<aleatorio) println("El numero es mayor")
    if (minumero==aleatorio) println("Has acertado")
}


}
fun leernum(): Int{
    var leido:String?

do {
    leido= readLine()


    leido?.let { leido ->
        try {

            return leido.toInt()}catch (e: NumberFormatException){

                println("El texto no es un numero o no esta en el rango comprendido")
            }
        }
}while (true)
}
