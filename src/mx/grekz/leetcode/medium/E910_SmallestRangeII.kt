package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E910_SmallestRangeII {
    fun smallestRangeII(A: IntArray, K: Int): Int {
        A.sort()
        val n = A.size - 1
        var res = A[n] - A[0]
        for ( i in 0.until(n) ) {
            val a = A[i] 
            val b = A[i+1]
            val h = Math.max(A[n] - K, a + K)
            val l = Math.min(A[0] + K, b - K)
            res = Math.min(res, h - l)
        }
        return res
    }
}