package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1012_ComplementofBase10Integer {
    fun bitwiseComplement(N: Int): Int {
        var a = 1
        while ( a < N ) a = a * 2 + 1
        return a - N
    }
}