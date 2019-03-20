package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E0714_BestTimetoBuyandSellStockwithTransactionFee {
    fun maxProfit(prices: IntArray, fee: Int): Int {
        var a = 0
        var b = -2147483648
        var c = 0
        for (x in prices) {
            c = a
            a = Math.max( a, b + x )
            b = Math.max( b, c - fee - x)
        }
        return a
    }
}