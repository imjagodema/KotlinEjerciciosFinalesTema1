fun main(){
    val array = arrayOf("Hola", "Qué", "Tal")
    println(array.contentToString())
    val lista = mutableListOf<String>("1", "5")
    println(lista)
    lista.add("7")
    println(lista)
    val lista2 = listOf<String>("1", "5")
    println(lista2)

}