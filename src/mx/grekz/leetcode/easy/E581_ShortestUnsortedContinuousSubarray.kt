package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E581_ShortestUnsortedContinuousSubarray {

    fun findUnsortedSubarray(nums: IntArray): Int {
        var n = nums.size-1
        var mi = 2147483647
        var ma = -2147483648
        var ini = -1
        var end = -2
        var a = 0
        var b = 0
        for ( i in 0..n ) {
            b = nums[n - i]
            a = nums[i]
            ma = Math.max(ma, a)
            mi = Math.min(mi, b)
            if ( a < ma ){
                end = i
            }
            if ( b > mi ){
                ini = n - i
            }
        }
        return end - ini + 1
    }
}