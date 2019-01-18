package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E951_FlipEquivalentBinaryTrees {
    fun flipEquiv(a: TreeNode?, b: TreeNode?): Boolean {
        return if ( a == null || b == null ) a == b else a.`val` == b.`val` && (flipEquiv(a.left, b.left) && flipEquiv(a.right, b.right) || flipEquiv(a.right, b.left) && flipEquiv(a.left, b.right))
    }
}