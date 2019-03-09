package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
class E765_CouplesHoldingHands {
    fun minSwapsCouples(row: IntArray): Int {
        val n = row.size
        var res = 0
        var pos = IntArray(n){0}
        for ( i in 0.until(n) )
            pos[row[i]] = i
        for ( i in 0.until(n).step(2) ) {
            val pair = row[i] xor 1
            if ( pair != row[i + 1] ) {
                row[pos[pair]] = row[i+1]
                pos[row[i+1]] = pos[pair]
                res += 1
            }
        }
        return res
    }
}