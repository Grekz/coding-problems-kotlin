package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E0941_ValidMountainArray {
    fun validMountainArray(A: IntArray): Boolean {
        var n = A.size
        var i = 0
        while ( i + 1 < n && A[i] < A[i + 1] ) i+=1 
        if ( i== 0 || i == n - 1 ) return false
        while ( i + 1 < n && A[i] > A[i + 1] ) i+=1
        return i == n - 1
    }
}