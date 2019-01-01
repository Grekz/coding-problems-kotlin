package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E944_DeleteColumnstoMakeSorted {
    fun minDeletionSize(A: Array<String>): Int {
        var ( lenA, lenW, res) = listOf(A.size - 1, A[0].length, 0)
        for ( i in 0 until lenW ) {
            for ( j in 0 until lenA )
                if ( A[j].get(i) > A[j+1].get(i) ) {
                    res += 1
                    break
                }  
        }
        return res
    }
}