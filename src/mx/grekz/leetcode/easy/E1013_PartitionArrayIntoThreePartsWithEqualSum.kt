package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1013_PartitionArrayIntoThreePartsWithEqualSum {
    fun canThreePartsEqualSum(A: IntArray): Boolean {
        var sum = A.sum()
        if ( sum % 3 != 0 ) {
            return false
        }
        sum /= 3
        var tmp = 0
        var cnt = 0
        for ( x in A ) {
            tmp += x
            if ( sum == tmp ) {
                tmp = 0
                cnt += 1
            }
        }
        return cnt == 3
    }
}