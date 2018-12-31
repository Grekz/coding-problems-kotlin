package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E965_UnivaluedBinaryTree {
    fun isUnivalTree(root: TreeNode?): Boolean {
        if ( root == null )
            return true
        else {
            if ( root.left != null && root.left.`val` != root.`val` || !isUnivalTree(root.left) ) {
                return false
            } 
            if ( root.right != null && root.right.`val` != root.`val` || !isUnivalTree(root.right) ) {
                return false
            }
            return true
        }
    }
}