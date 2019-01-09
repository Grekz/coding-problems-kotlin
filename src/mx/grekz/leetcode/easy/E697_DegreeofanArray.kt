package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E697_DegreeofanArray {

    fun findShortestSubArray(nums: IntArray): Int {
        var counts = mutableMapOf<Int, Int>()
        var ini = mutableMapOf<Int,Int>()
        var max = 0
        var res = 0
        for ( (i, x) in nums.withIndex() ) {
            var curIni = ini.getOrPut(x){i}
            var cur = counts.getOrPut(x){0} + 1
            counts.set(x,cur)
            if (max < cur) {
                max = cur
                res = i - curIni + 1
            }else if ( max == cur) {
                res = Math.min(res, i - curIni + 1)
            }
        }
        return res
    }
}