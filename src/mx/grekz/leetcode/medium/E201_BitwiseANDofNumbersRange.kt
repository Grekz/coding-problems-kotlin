package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E201_BitwiseANDofNumbersRange {

    fun rangeBitwiseAnd(m: Int, _n: Int): Int {
        var n = _n
        while ( m < n ) n = n and (n-1)
        return n
    }
}