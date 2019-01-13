package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E938_RangeSumofBST {
    fun rangeSumBST(root: TreeNode?, L: Int, R: Int): Int {
        if ( root == null ) return 0
        var res = 0
        if ( L <= root.`val` && root.`val` <= R )
            res += root.`val`
        if ( L <= root.`val` )
            res += rangeSumBST(root.left, L, R)
        if ( R >= root.`val` )
            res += rangeSumBST(root.right, L, R)
        return res
    }
}