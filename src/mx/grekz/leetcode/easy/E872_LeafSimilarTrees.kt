package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E872_LeafSimilarTrees {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean = dfs(root1!!).equals(dfs(root2!!))
    fun dfs(n: TreeNode?): String = if ( n == null ) "" else (if (n.right == n.left) "${n.`val`}" else dfs(n.left) + dfs(n.right))
}