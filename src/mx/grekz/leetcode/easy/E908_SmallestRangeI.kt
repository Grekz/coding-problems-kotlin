package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E908_SmallestRangeI {
    fun smallestRangeI(A: IntArray, K: Int): Int {
        return Math.max(0, A.max()!! - A.min()!! - 2 * K)
    }
}