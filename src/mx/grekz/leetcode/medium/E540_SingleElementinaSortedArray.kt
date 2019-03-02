package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E540_SingleElementinaSortedArray {
    fun singleNonDuplicate(nums: IntArray): Int {
        var i = 0
        var j = nums.size - 1 
        while ( i < j ) {
            val mid = i + ( j - i ) / 2
            if ( nums[mid] == nums[mid xor 1] )
                i = mid + 1
            else
                j = mid
        }
        return nums[i]
    }
}