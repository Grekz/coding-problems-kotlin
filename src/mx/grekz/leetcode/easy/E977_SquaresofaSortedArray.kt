package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E977_SquaresofaSortedArray {
    fun sortedSquares(A: IntArray): IntArray {
        val n = A.size
        var res = IntArray(n)
        for ( i in 0.until(n) ) A[i] *= A[i]
        var ( i, j, k) = listOf(0, n-1, n-1)
        while ( i <= j ) {
            if ( A[i] < A[j] ) {
                res[k] = A[j]
                j -= 1
            } else {
                res[k] = A[i]
                i += 1
            } 
            k -= 1
        }
        return res
    }
}