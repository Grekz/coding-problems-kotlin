package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E0674_LongestContinuousIncreasingSubsequence {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var res = 0
        var count = 0
        for ( i in 0.until(nums.size) ) { 
            if ( i < 1 || nums[i-1] < nums[i] ) {
                count += 1
                res = Math.max(res, count)
            } else {
                count = 1  
            }
        }
        return res
    }
}