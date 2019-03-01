package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E228_SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        val n = nums.size
        var i = 0
        var j = 0
        var res = mutableListOf<String>()
        while ( i < n ) {
            val c = nums[i].toString()
            j = i
            while ( j + 1 < n && nums[j + 1] - nums[j] == 1 ) 
                j += 1
            res.add(c + (if ( i == j ) "" else "->" + nums[j].toString()))
            i = j + 1
        }
        return res.toList()
    }
}