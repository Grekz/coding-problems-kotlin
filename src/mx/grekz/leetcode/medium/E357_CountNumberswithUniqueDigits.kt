package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E357_CountNumberswithUniqueDigits {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        return if ( n == 0 ) 1
        else if ( n == 1 ) 10
        else if ( n == 2 ) 91
        else if ( n > 10 ) 0
        else {
            var res = 10
            var t = 9
            for ( i in 1.until(n) ){
                t *= 10 - i
                res += t
            }
            res
        }
    }
}