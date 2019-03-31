package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1018_BinaryPrefixDivisibleBy5 {
    fun prefixesDivBy5(A: IntArray): BooleanArray {
        var tmp = 0
        var i = 0
        var res = BooleanArray(A.size){false}
        for ( x in A ) {
            tmp = ( ( tmp shl 1 ) + x ) % 5
            res[i] = tmp == 0
            i += 1
        }
        return res
    }
}