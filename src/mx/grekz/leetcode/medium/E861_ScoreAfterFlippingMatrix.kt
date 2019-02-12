package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E861_ScoreAfterFlippingMatrix {
    fun matrixScore(A: Array<IntArray>): Int {
        var rows = A.size
        var cols = A[0].size
        var ans = 0
        for ( c in 0.until(cols) ) {
            var col = 0
            for ( r in 0.until(rows) ) {
                col += A[r][c] xor A[r][0]
            }
            ans += Math.max(col, rows - col) * ( 1 shl ( cols - c - 1 ) )
        }
        return ans
    }
}