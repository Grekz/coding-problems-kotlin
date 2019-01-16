package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E338_CountingBits {
    fun countBits(num: Int): IntArray {
        var res = IntArray(num + 1)
        for ( i in 1.rangeTo(num) )
           res[i] = res[i/2] + i % 2 
        return res
    }
}