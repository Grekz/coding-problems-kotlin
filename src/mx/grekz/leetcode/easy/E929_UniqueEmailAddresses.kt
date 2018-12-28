package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E929_UniqueEmailAddresses {
    fun numUniqueEmails(emails: Array<String>): Int {
        var s = mutableSetOf<String>()
        for ( e in emails ) {
            var parts = e.split("[@+]".toRegex())
            var a = parts[0].replace(".","")
            s.add(a+parts.last())
        }
        return s.size
    }
}