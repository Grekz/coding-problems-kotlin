package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E486_PredicttheWinner {
    fun PredictTheWinner(nums: IntArray): Boolean {
        val n = nums.size
        var dp = IntArray(n){0}
        for ( i in n.downTo(0) )
            for ( j in (i+1).until(n) ) {
                val a = nums[i] - dp[j]
                val b = nums[j] - dp[j - 1]
                dp[j] = Math.max(a, b)
            }
        return dp[n-1] >= 0
    }
}