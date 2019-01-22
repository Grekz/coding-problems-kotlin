package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E746_MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val n = cost.size
        for ( i in 2.until(n))
            cost[i] += Math.min(cost[i-1], cost[i-2])
        return Math.min(cost[n-1], cost[n-2])
    }
}