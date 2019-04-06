package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E0309_BestTimetoBuyandSellStockwithCooldown {
    fun maxProfit(prices: IntArray): Int {
        var a = 0
        var b = 0 
        var c = Integer.MIN_VALUE
        for (price in prices) {
            var d = b
            b = Math.max(b, c + price)
            c = Math.max(c, a - price)
            a = d
        }
        return b
    }
}