package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E701_InsertintoaBinarySearchTree {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if ( root == null ) return TreeNode(`val`)
        if ( `val` < root.`val` ) 
            root.left = insertIntoBST(root.left, `val`)
        else
            root.right = insertIntoBST(root.right, `val`)
        return root
    }
}