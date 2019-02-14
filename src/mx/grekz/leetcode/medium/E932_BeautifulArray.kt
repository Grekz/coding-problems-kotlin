package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E932_BeautifulArray {

    fun beautifulArray(N: Int): IntArray {
        var res = mutableListOf<Int>(1)
        while ( res.size < N ) {
            var tmp = mutableListOf<Int>()
            for ( i in res )
                if ( i * 2 - 1 <= N )
                    tmp.add(i * 2 - 1)
            for ( i in res )
                if ( i * 2 <= N )
                    tmp.add(i * 2)
            res = tmp
        }
        return res.toIntArray()
    }
}