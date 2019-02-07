package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E089_GrayCode {
    fun grayCode(n: Int): List<Int> {
        var res = IntArray(1 shl n)
        for ( i in 0.until(res.size) )
            res[i] = i xor (i shr 1)
        return res.toList()
    }
}