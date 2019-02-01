package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
class E982_TripleswithBitwiseANDEqualToZero {

    fun countTriplets(A: IntArray): Int {
        var res = 0
        val tmp = mutableMapOf<Int, Int>().withDefault { 0 }
        for ( a in A )
            for( b in A ) {
                val c = a and b
                tmp[c] = tmp.getValue(c) + 1
            }
        for ( (k,v) in tmp)
            for( a in A )
                if ( (k.and(a)) == 0 )
                    res += v
        return res
    }
}