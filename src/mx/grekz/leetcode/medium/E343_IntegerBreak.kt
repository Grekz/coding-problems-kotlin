package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E343_IntegerBreak {
    fun integerBreak(_n: Int): Int {
        return if ( _n == 2 )
            1
        else if ( _n == 3 )
            2
        else {
            var res = 1
            var n = _n
            while ( n > 4 ) {
                res *= 3
                n -= 3
            }
            res * n
        }
    }
}