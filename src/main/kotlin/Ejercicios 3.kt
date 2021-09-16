fun main (){
numero(784)
}
fun numero (ent : Int){
var i=0
    repeat(ent){
        i++
print(ent.toChar())
        if (i % 10 == 0)
            println(" ")
}
}
