package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E961_NRepeatedElementinSize2NArray {
    fun repeatedNTimes(A: IntArray): Int {
        var c = mutableMapOf<Int, Boolean>()
        for ( x in A ) {
            if ( c.contains(x) )
                return x
            c.put(x,true)
        }
        return -1
    }
}