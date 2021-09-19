fun main () {
 println(int4(null,9,4,5))
}
fun int4(n1: Int?, n2: Int?, n3: Int?, n4: Int?): Int? {
    return if (n1!=null || n2!=null || n3!=null || n4!=null )
        n1!! + n2!! + n3!! + n4!!
    else
        return null
}