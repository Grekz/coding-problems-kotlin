package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E709_ToLowerCase {
    fun toLowerCase(str: String): String {
        return str.fold(""){ res, it -> res + ( if ( 65 <= it.toInt() && it.toInt() <= 90 ) (it.toInt() + 32).toChar() else it ) }
        // return str.map{ if ( 65 <= it.toInt() && it.toInt() <= 90 ) (it.toInt() + 32).toChar() else it }.joinToString("")
    }
}