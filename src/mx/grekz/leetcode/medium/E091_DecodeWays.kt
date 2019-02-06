package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E091_DecodeWays {
    fun numDecodings(s: String): Int {
        return if ( s.length < 1 || s.get(0) == '0' )
            0
        else {
            var res = IntArray(s.length + 1)
            res[1] = 1
            res[0] = 1
            for ( i in 2..(s.length) ) {
                var a = s.get(i-2)
                var b = s.get(i-1)
                if ( b != '0' ) {
                    res[i] = res[i-1]
                }
                if ( a == '1' || ( a == '2' && b < '7' ) ) {
                    res[i] += res[i-2]
                }
            }
            res[s.length]
        }
    }
}