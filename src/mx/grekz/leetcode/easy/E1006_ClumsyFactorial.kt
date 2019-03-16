package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1006_ClumsyFactorial {
    fun clumsy(N: Int): Int {
        val magic = intArrayOf(1, 2, 2, -1, 0, 0, 3, 3)
        return N + magic[if( N > 4 ) N % 4 else N + 3]
    }
}