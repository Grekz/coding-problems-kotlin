package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E739_DailyTemperatures {
    fun dailyTemperatures(T: IntArray): IntArray {
        var n = T.size
        var top = -1
        var res = IntArray(n)
        var stack = IntArray(n)
        var idx = 0
        for ( i in 0.until(n) ) {
            while ( top >= 0 && T[i] > T[stack[top]] ) {
                idx = stack[top]
                top -= 1
                res[idx] = i - idx
            }
            top += 1
            stack[top] = i
        }
        return res
    }
}