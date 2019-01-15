package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E973_KClosestPointstoOrigin {
    fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
        points.sortBy({it[0]*it[0]+it[1]*it[1]})
        return points.sliceArray(0..(K-1))
    }
}