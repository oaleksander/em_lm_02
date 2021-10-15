fun main() {

    var Sm = 0.2
    var cN = 15.0
    var cM = 1.0
    var Mmax = 26.613// Это получи из точки перегиба
    var kM = 2.3 // Это вводи
    var zp = 1 // Это ввводи
    var Sn = Sm * (kM - Math.sqrt(kM * kM - 1.0))
    var Mn = 2.0 * Mmax * Sn * Sm / (Sm * Sm + Sn * Sn) //1
    var nn = (1.0 - Sn) * 3000.0 / zp //2
    var omega0 = 50*60/zp
    var kv = omega0/14.869
    println(Mn)
    println(nn)

}