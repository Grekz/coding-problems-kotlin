package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E704_BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        return bSearch(nums, target, 0, nums.size - 1)
    }
    fun bSearch(nums: IntArray, target: Int, ini: Int, end: Int): Int {
        if ( ini > end ) 
            return -1
        val mid = ini + (end - ini) / 2
        if ( nums[mid] == target )
            return mid
        if ( nums[mid] > target )
            return bSearch(nums, target, ini, mid - 1)
        return bSearch(nums, target, mid + 1, end)
    }
}