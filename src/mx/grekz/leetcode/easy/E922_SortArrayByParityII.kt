package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E922_SortArrayByParityII {
    fun sortArrayByParityII(A: IntArray): IntArray {
        var (i, j ) = listOf(0, 1)
        var res = IntArray(A.size)
        for ( x in A ) {
            if ( x % 2 == 0 ) {
                res[i] = x
                i += 2
            }else{
                res[j] = x
                j += 2
            }
        }
        return res
    }
}