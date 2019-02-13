package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
class E045_JumpGameII {
    fun jump(nums: IntArray): Int {
        var count = 0
        var end = 0
        var far = 0
        for ( i in 0.until(nums.size - 1)) {
            far = Math.max(far, i + nums[i])
            if ( i == end ) {
                count += 1
                end = far
            }
        }
        return count
    }
}