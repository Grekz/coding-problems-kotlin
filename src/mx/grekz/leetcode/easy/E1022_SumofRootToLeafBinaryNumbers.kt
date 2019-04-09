package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E1022_SumofRootToLeafBinaryNumbers {
    fun sumRootToLeaf(root: TreeNode?): Int {
        return dfs(root, 0)
    }
    fun dfs(n:TreeNode?, x: Int): Int {
        return if ( n == null ) 0
        else {
            val c = x * 2 + n.`val`
            if ( n.left == null && n.right == null )
                c
            else
                dfs(n.left, c) + dfs(n.right, c)
        }
    }
}