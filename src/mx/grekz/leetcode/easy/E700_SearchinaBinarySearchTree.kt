package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E700_SearchinaBinarySearchTree {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if ( root == null ) return null
        if ( root.`val` == `val` ) return root
        return searchBST(if (`val` < root.`val`) root.left else root.right, `val`);
    }
}