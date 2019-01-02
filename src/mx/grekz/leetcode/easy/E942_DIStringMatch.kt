package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E942_DIStringMatch {
    fun diStringMatch(S: String): IntArray {
        var n = S.length
        var ( left, right ) = listOf(0, n)
        var res = IntArray(n + 1)
        for ( (i,x) in S.withIndex() )
            res[i] = if( x == 'I' ) left++ else right--
        res[n] = right
        return res
    }
}