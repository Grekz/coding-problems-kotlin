package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E896_MonotonicArray {
    fun isMonotonic(A: IntArray): Boolean {
        var ( a, b ) = listOf(true, true)
        for ( i in 1 until A.size ) {
            a = a && A[i - 1] <= A[i]
            b = b && A[i - 1] >= A[i]
        }
        return a || b
    }
}