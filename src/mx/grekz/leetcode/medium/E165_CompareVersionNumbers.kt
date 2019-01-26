package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E165_CompareVersionNumbers {
    fun compareVersion(version1: String, version2: String): Int {
        val ( a, b ) = listOf( version1.split("."), version2.split(".") )
        val ( al, bl ) = listOf( a.size, b.size )
        val n = Math.max(al, bl)
        for ( i in 0.until(n) ) {
            val c = ( if ( i < al ) a[i].toInt() else 0 ) - ( if ( i < bl ) b[i].toInt() else 0 )   
            if ( c < 0 )
                return -1
            else if ( c > 0 )
                return 1
        }
        return 0
    }
}