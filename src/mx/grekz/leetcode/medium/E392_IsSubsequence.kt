package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E392_IsSubsequence {

    fun isSubsequence(s: String, t: String): Boolean {
        var idx = -1
        for ( c in s ) {
            idx = t.indexOf(c, idx + 1)
            if ( idx == -1 )
                return false
        }
        return true
    }
}