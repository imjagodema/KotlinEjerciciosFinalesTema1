fun main (){
val st = calcularPrecio2(-50, "Javi")
println(st)
}
fun calcularPrecio (edad : Int, nombre : String): String {
    return if (edad in 1..17) "$nombre , debes abonar 5€"
    else
        if (edad in 18..65) "$nombre , debes abonar 10€"
        else
            if (edad>65) "$nombre, para ti es gratis"
            else
                "Edad no válida"
}

fun calcularPrecio2 (edad : Int, nombre : String): String {
    when {
        edad <=0 -> return "$nombre, no has puesto una edad válida"
        edad in 1..17 -> return "$nombre, debes abonar 5€"
        edad in (18..65) -> return "$nombre, debes abonar 10€"
        else -> return "$nombre, para ti es gratis"

    }
}

fun calcularPrecio3 (edad : Int, nombre : String): String {
    when (edad){
        0 -> return "$nombre, no has puesto una edad válida"
        in 1..17 -> return "$nombre, debes abonar 5€"
        in (18..65) -> return "$nombre, debes abonar 10€"
        else -> return "$nombre, para ti es gratis"

    }
}