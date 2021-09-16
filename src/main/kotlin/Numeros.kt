fun main () {
    var resultado = " "
    var resultado2 = " "
    resultado=numeros(17).toString()
    println(resultado)
    resultado2=parImpar(5)
    println(resultado2)
}
fun numeros (num : Int): Int {
    var num2 = 0
    return if (num>0) {
        num2 = num * 2 + 3
        num2
    } else
        if (num != 0) {
            num2 = num / 2 - 3
            num2
        } else 0

}
fun parImpar (num: Int): String{
    return if (num%2 == 0)
        "El número es par"
    else
        "El número es impar"
}