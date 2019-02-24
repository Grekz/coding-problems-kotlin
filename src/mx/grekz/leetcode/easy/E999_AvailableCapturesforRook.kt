package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E999_AvailableCapturesforRook {

    fun numRookCaptures(board: Array<CharArray>): Int {
        val rows = board.size
        val cols = board[0].size
        var ans = 0
        var posR = 0
        var posC = 0
        for ( i in  0 until rows )
            for (j in 0 until cols ) {
                if ( board[i][j] == 'R' ) {
                    posR = i
                    posC = j
                    break
                }
            }   
        for ( i in posR + 1 until rows)
            if ( board[i][posC] != '.' ) {
                if ( board[i][posC] == 'p' )
                    ans += 1
                break
            }   
        for ( i in posR - 1 downTo 0 )
            if ( board[i][posC] != '.' ) {
                if ( board[i][posC] == 'p' )
                    ans += 1
                break
            }   
        for ( i in posC + 1 until cols )
            if ( board[posR][i] != '.' ) {
                if ( board[posR][i] == 'p' )
                    ans += 1
                break
            }   
        for ( i in posC - 1 downTo 0 )
            if ( board[posR][i] != '.' ) {
                if ( board[posR][i] == 'p' )
                    ans += 1
                break
            }   
        return ans
    }
}