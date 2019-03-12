package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E856_ScoreofParentheses {
    fun scoreOfParentheses(S: String): Int {
        var bal = 0
        var res = 0
        var prev = '0'
        for ( c in S.toCharArray() ) {
            if ( c == '(' )
                bal+=1
            else {
                bal-=1
                if ( prev == '(') {
                    res += 1 shl bal
                }
            }
            prev = c
        }
        return res
    }
}