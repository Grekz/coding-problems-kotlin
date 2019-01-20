package mx.grekz.leetcode.medium

/**
 * @author grekz
 */
class E841_KeysandRooms {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        var seen = BooleanArray(rooms.size)
        var stack = java.util.Stack<Int>()
        stack.push(0)
        seen[0] = true
        while ( !stack.isEmpty() ) {
            var cur = stack.pop()
            for ( x in rooms[cur] ) {
                if ( !seen[x] ) {
                    seen[x] = true
                    stack.push(x)
                }
            }
        }
        return !seen.contains(false)
    }
}