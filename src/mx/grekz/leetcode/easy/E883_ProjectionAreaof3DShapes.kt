package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E883_ProjectionAreaof3DShapes {
    fun projectionArea(grid: Array<IntArray>): Int {
        var n = grid.size - 1
        var res = 0
        for ( i in 0..n ) {
            var col = 0
            var row = 0
            for ( j in 0..n ) {
                if ( grid[i][j] > 0 ) {
                    res += 1 
                }
                row = Math.max(grid[i][j], row)
                col = Math.max(grid[j][i], col)
            }
            res += col + row
        }
        return res
    }
}