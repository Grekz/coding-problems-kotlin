package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1013_PairsofSongsWithTotalDurationsDivisibleby60 {
    fun numPairsDivisibleBy60(time: IntArray): Int {
        var res = 0 
        var cnt = IntArray(60){0}
        for ( x in time ) {
            val d = (60 - x % 60) % 60
            res += cnt[d]
            cnt[x%60] += 1
        }
        return res
    }
}