package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E031_NextPermutation {

    fun nextPermutation(nums: IntArray): Unit {
        fun swap( a: Int, b: Int): Unit {
            val x = nums[a]    
            nums[a] = nums[b]
            nums[b] = x
            
        }
        var n = nums.size - 1
        var (i, j) = listOf(n-1, n)
        while ( i >= 0 && nums[i] >= nums[i+1] )
            i-=1
        if ( i >= 0 ) {
            while ( nums[j] <= nums[i] ) j-=1
            swap(i, j)
        }
        i+=1
        while ( i < n ) {
            swap(i, n)
            i+=1
            n-=1
        }
    }
}