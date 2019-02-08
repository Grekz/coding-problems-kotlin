package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E696_CountBinarySubstrings {
    fun countBinarySubstrings(s: String): Int {
        var a = 0
        var p = 0
        var c = 1
        var n = s.length - 1
        for ( i in 1..n )
            if ( s.get(i) != s.get(i-1) ) {
                a += Math.min(p, c)
                p = c
                c = 1
            }else{
                c += 1
            }
        return a + Math.min(p, c)
    }
}