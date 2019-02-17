package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E868_BinaryGap {
    fun binaryGap(N: Int): Int {
        var res = 0
        var l = -1
        for ( i in 0..31) {
            if ( ( ( N shr i ) and 1 ) > 0 ) {
                if ( l >= 0 ) {
                    res = Math.max(res, i - l)
                }
                l = i
            }
        }
        return res
    }
}