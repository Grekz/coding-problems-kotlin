package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E653_TwoSumIVInputisaBST {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        var s = mutableSetOf<Int>()
        return dfs(root, k, s)
    }
    fun dfs(root: TreeNode?, k: Int, s: MutableSet<Int>): Boolean {
        return if ( root == null ) {
            false
        }else if ( s.contains(k - root.`val`) ) {
            true
        }else{
            s.add(root.`val`)
            dfs(root.left, k, s) || dfs(root.right, k, s)
        }
    }
}