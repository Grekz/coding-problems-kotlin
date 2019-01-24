package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E034_FindFirstandLastPositionofElementinSortedArray {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if ( nums == null || nums.size < 1 ) return intArrayOf(-1,-1)
        val idx = bSearch(nums, target, true)
        if ( nums[idx % nums.size] != target ) return intArrayOf(-1,-1)
        val rIdx = bSearch(nums, target, false) - 1
        return intArrayOf(idx, rIdx)
    }        
    fun bSearch(n: IntArray, t: Int, l: Boolean): Int {
        var ( a, b, m ) = intArrayOf(0, n.size, 0)
        while ( a < b ) {
            m = a + ( b - a ) / 2
            if ( n[m] > t || ( l && n[m] == t ) ) {
                b = m
            }else{
                a = m + 1
            }
        }
        return a
    }
}