package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E322_CoinChange {

    fun coinChange(coins: IntArray, amount: Int): Int {
        val m = amount + 1
        var dp = IntArray(m){m}
        dp[0] = 0
        for ( i in 1..amount)
            for ( c in coins )
                if ( c <= i )
                    dp[i] = Math.min(dp[i], dp[i - c] + 1)
        return if ( dp[amount] <= amount )
            dp[amount]
        else
            -1
    }
}