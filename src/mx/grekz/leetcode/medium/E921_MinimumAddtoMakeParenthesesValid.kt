package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E921_MinimumAddtoMakeParenthesesValid {
    fun minAddToMakeValid(S: String): Int {
        var res = 0
        var bal = 0
        for ( x in S ){
            bal += (if ( x == '(' ) 1 else -1)
            if ( bal == -1 ) {
                bal = 0
                res += 1
            }     
        }
        return bal + res
    }
}