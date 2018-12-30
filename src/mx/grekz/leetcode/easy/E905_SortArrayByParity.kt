package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E905_SortArrayByParity {
    fun sortArrayByParity(A: IntArray): IntArray {
        var ( i, j ) = listOf( 0, A.size - 1)
        while ( i < j ) {
            var cur = A[i]
            if ( cur % 2 == 1 ) { 
                A[i] = A[j]
                A[j] = cur
                j -= 1
            } else {
                i += 1
            }
        }
        return A
    }
}