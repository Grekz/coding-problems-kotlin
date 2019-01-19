package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E976_LargestPerimeterTriangle {
    fun largestPerimeter(A: IntArray): Int {
        A.sort()
        for( i in (A.size -1).downTo(2)) {
            if (A[i] < A[i-1] + A[i -2])
                return A[i] + A[i-1] + A[i -2]
        }
        return 0
    }
}