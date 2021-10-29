fun one(){
    var Sm = 0.2
    var Mmax = 20.736// Это получи из точки перегиба
    var kM = 2.0 // Это вводи
    var zp = 3 // Это ввводи
    var Sn = Sm * (kM - Math.sqrt(kM * kM - 1.0))
    var Mn = 2.0 * Mmax * Sn * Sm / (Sm * Sm + Sn * Sn) //1
    var nn = (1.0 - Sn) * 3000.0 / zp //2
    println(Mn)
    println(nn)
}

fun two(){
    val istart = 1.191
    val ks = 1.105
    print(istart/ks)
}

fun three(){
    val ad = 1500 // rot/min
    val ktg = 10.0
    val nm = 1.0
    val ustatic = 1500*10.0/1000.0
    val i1 = 0.283
    val i2 = 1.055

    println(ustatic)
    println(i1/(i1+i2))

}

fun main() {
one()
}