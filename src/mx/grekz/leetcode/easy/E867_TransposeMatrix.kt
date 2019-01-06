package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E867_TransposeMatrix {
    fun transpose(A: Array<IntArray>): Array<IntArray> {
        var res = Array(A[0].size, { i -> IntArray(A.size)} )
        A.forEachIndexed {
            i, a -> a.forEachIndexed { j, b -> res[j][i] = b }
        } 
        return res
    }
}