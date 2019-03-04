package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E890_FindandReplacePattern {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
       var res = mutableListOf<String>()
        for ( x in words ) {
            if ( check(x, pattern) )
                res.add(x)
        }
        return res.toList()
    }
    fun check( a: String, b: String ): Boolean {
        var m = mutableMapOf<Char,Char>()
        var i = 0
        for ( x in a ) {
            val bChar = b.get(i)
            i += 1
            m.getOrPut(x, {bChar})
            if ( m.get(x) != bChar ) 
                return false
        }
        var ch = BooleanArray(26){false}
        for ( x in m.values ) {
            val cInd = x.toInt() - 97
            if ( ch[cInd] )
                return false
            ch[cInd] = true
        }
        return true
    }
}