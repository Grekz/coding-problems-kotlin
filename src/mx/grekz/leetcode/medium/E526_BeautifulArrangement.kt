package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E526_BeautifulArrangement {
    fun countArrangement(N: Int): Int {
        var count = 0
        var v = BooleanArray(N+1)
        fun permutate(pos: Int): Unit{
            if ( pos > N ) 
                count += 1 
            else
                for ( i in 1..N ) 
                    if ( !v[i] && ( i % pos == 0 || pos % i == 0 ) ) {
                        v[i] = true
                        permutate(pos+1)
                        v[i] = false
                    }
        }
        permutate(1)
        return count
    }
}