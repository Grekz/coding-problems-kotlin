package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E953_VerifyinganAlienDictionary {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        if ( words.size > 1 ) {
            var dict = createDict(order)
            var prev = words[0]
            for ( w in words ) {
                if ( compare(prev, w, dict) > 0 ) {
                    return false
                }
                prev = w
            }
        } 
        return true
    }
    fun createDict(s: String): MutableMap<Char, Int> {
        var res = mutableMapOf<Char, Int>()
        for ( (i,c) in s.withIndex()) res.put(c,i)
        return res
    }
    fun compare(a: String, b: String, dict:MutableMap<Char, Int>): Int {
        var (al, bl, com, i) = arrayOf(a.length, b.length, 0, 0)
        while ( i < al && i < bl && com == 0 ) {
            com = dict[a[i]]!! - dict[b[i++]]!!
        }
        return if ( com == 0 ) al - bl else com
    }    
}