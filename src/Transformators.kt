import kotlin.jvm.JvmStatic
import java.lang.Math

fun main(args: Array<String>) {
    val v_n: Double
    val p_n: Double
    val i_n: Double
    val p1k: Double
    val u1k: Double
    val i1k: Double
    val u20: Double
    val i2k: Double
    val z_k: Double
    val r_k: Double
    val x_k: Double
    val cos1: Double
    val cos2: Double
    val sin1: Double
    var sin2: Double
    val sign: Double
    sign = 1.0
    cos1 = 0.5
    v_n = 220.0
    p_n = 86.6
    i_n = p_n / v_n
    println(i_n)
    p1k = 7.49
    u1k = 29.76
    i1k = 0.394
    i2k = 0.685
    z_k = u1k / i1k
    r_k = p1k / (i1k * i1k)
    x_k = Math.sqrt(z_k * z_k - r_k * r_k)
    u20 = 124.28
    cos2 = p1k / (i1k * u1k)
    sin1 = Math.sqrt(1 - cos1 * cos1)
    sin2 = Math.sqrt(1 - cos2 * cos2)
    sin2 = sign * sin2
    val result = u20 - u1k * (cos1 * cos2 + sin1 * sin2) / ((i2k / i1k + v_n / u20) / 2)
    println(result)
    println()
}