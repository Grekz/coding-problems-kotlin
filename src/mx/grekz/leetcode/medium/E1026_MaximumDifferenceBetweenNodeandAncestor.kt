package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E1026_MaximumDifferenceBetweenNodeandAncestor {
    fun maxAncestorDiff(root: TreeNode?): Int {
        return dfs(root, root!!.`val`, root!!.`val`)
    }
    fun dfs( node: TreeNode?, max: Int, min: Int) : Int {
        if ( node == null ) {
            return max - min
        }
        var ma = Math.max(max, node.`val`)
        var mi = Math.min(min, node.`val`)
        return Math.max(dfs(node.left, ma, mi), dfs(node.right, ma, mi))
    }
}