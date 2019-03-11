package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E979_DistributeCoinsinBinaryTree {
    fun distributeCoins(root: TreeNode?): Int {
        var ans = 0
        fun dfs(n: TreeNode?): Int {
            return if ( n == null )
                0
            else{
                var l = dfs(n.left)
                var r = dfs(n.right)
                ans += Math.abs(l) + Math.abs(r)
                r + l + n.`val`!! - 1 
            }
        }
        dfs(root)
        return ans
    }
}