package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E055_JumpGame {
    fun canJump(nums: IntArray): Boolean {
        var last = nums.size - 1
        for ( i in last.downTo(0) )
            if ( i + nums[i] >= last )
                last = i
        return last == 0
    }
}