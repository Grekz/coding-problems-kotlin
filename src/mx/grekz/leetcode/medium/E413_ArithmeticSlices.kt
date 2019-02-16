package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E413_ArithmeticSlices {
    fun numberOfArithmeticSlices(A: IntArray): Int {
        var res = 0
        var tmp = 0
        var n = A.size - 1
        for ( i in 2..n ) {
            if ( A[i] - A[i-1] == A[i-1] - A[i-2] ) {
                tmp += 1
                res += tmp
            }else{
                tmp = 0
            }
        }
        return res
    }
}