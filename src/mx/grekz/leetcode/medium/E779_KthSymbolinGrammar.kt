package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E779_KthSymbolinGrammar {
    fun kthGrammar(N: Int, K: Int): Int {
        var n = 0 
        var k = K - 1
        while (k > 0){
            k = k and (k - 1)
            n += 1
        }
        return n and 1
    }
}