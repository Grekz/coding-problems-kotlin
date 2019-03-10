package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
class E010_RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        val tn = s.length
        val pn = p.length
        var dp = Array<BooleanArray>(tn+1){BooleanArray(pn+1){false}}
        dp[tn][pn] = true
        for ( i in tn downTo 0 ) {
            for ( j in pn - 1 downTo 0 ) {
                val fm = i < tn && ( s[i] == p[j] || p[j] == '.' )
                if ( j + 1 < pn && p[j+1] == '*' )
                    dp[i][j] = dp[i][j+2] || fm && dp[i+1][j]
                else
                    dp[i][j] = fm && dp[i+1][j+1]
            }
        }
        return dp[0][0]
    }
}