package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E0997_FindtheTownJudge {
    fun findJudge(N: Int, trust: Array<IntArray>): Int {
        var c = IntArray(N + 1){0}
        for ( x in trust ) {
            c[x[0]] -= 1
            c[x[1]] += 1
        }
        for ( i in 1..N ) {
            if ( c[i] == N - 1 ) {
                return i
            }
        }
        return -1
    }
}