package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E789_EscapeTheGhosts {
    fun escapeGhosts(ghosts: Array<IntArray>, target: IntArray): Boolean {
        val t0 = target[0]
        val t1 = target[1]
        val dest = Math.abs(t1) + Math.abs(t0)
        for ( g in ghosts ) {
            val cur = Math.abs(g[0] - t0) + Math.abs(g[1]-t1)
            if ( cur <= dest )
                return false
        }
        return true
    }
}