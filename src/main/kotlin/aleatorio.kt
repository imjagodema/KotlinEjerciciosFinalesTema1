fun main(){
   println(generarPalabraAleatoria())

}
fun generarPalabraAleatoria(): String {
   var st=""
    val Rango = 'a'..'z'
    st=st+Rango.random().uppercaseChar()
   repeat(3){
       st=st+Rango.random()
   }
    return st

}