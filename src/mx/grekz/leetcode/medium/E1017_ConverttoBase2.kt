package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E1017_ConverttoBase2 {
    fun baseNeg2(N: Int): String {
        var res = ""
        var n = N
        while ( n != 0) {
            res = ( n and 1 ).toString() + res
            n = -( n shr 1)
        }
        return if ( res.length > 0 ) res else "0"
    }
}