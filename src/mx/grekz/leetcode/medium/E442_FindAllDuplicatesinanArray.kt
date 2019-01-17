package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E442_FindAllDuplicatesinanArray {
    fun findDuplicates(nums: IntArray): List<Int> {
        var res = arrayListOf<Int>()
        for ( i in 0 until nums.size ) {
            val cur = Math.abs(nums[i]) - 1
            if ( nums[cur] < 0 )
                res.add(cur + 1)
            else
                nums[cur] = -nums[cur]
        }
        return res
    }
}