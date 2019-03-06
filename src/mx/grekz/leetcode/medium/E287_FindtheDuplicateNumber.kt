package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E287_FindtheDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        val n = nums.size
        for ( i in 0.until(n) ) {
            val cur = Math.abs(nums[i]) - 1
            if ( nums[cur] < 0 )
                return cur + 1
            nums[cur] = -nums[cur] 
        }
        return -1
    }
}