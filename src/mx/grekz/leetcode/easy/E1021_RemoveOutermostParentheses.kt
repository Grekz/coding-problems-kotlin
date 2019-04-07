package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1021_RemoveOutermostParentheses {
    fun removeOuterParentheses(S: String): String {
        var c = 0
        var res = ""
        for ( x in S ){
            if (x == '('){
                if ( c > 0 )
                    res += x
                c += 1
            }                
            if (x == ')') {
                if (c > 1) 
                    res += x
                c -= 1
            }
        }
        return res
    }
}