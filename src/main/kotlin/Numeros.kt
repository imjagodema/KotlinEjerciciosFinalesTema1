fun main () {
var piso=10
    var ventana=4
    print(Piramide(piso))
    }

fun Piramide (numeroPiso :Int):String{
var aux=0
    var a:String=""
    repeat(numeroPiso){
  a=a+"/"
        repeat(numeroPiso){
            repeat(aux){
            a=a+"-"
            }
           }


            a= a+"\\ \n"
        aux=aux+2
        }


    return a
}
