package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E462_MinimumMovestoEqualArrayElementsII {
    fun minMoves2(nums: IntArray): Int {
        nums.sort()
        var i = 0
        var j = nums.size - 1
        var res = 0
        while (i < j) {
            res += nums[j] - nums[i]
            j -= 1
            i += 1
        }
        return res
    }
}