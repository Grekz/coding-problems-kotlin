package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E983_MinimumCostForTickets {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val mint = 2147483647
        val n = days.last()
        val cd = Array(n + 1) { 0 }
        for ( x in days )
            cd[x] = mint
        for ( x in 1..n ) {
            if ( cd[x] == mint ) {
                var mc = cd[x - 1] + costs[0]
                mc = Math.min(mc, cd[goz(x, 7)] + costs[1])
                mc = Math.min(mc, cd[goz(x, 30)] + costs[2])
                cd[x] = mc
            }else{
                cd[x] = cd[x - 1]
            }
        }
        return cd[n]
    }
    fun goz( a: Int, b: Int) : Int {
        if ( a < b ) {
            return 0
        }
        return a - b
    }
}