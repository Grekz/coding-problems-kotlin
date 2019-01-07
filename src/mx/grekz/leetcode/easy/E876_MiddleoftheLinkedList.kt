package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E876_MiddleoftheLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        fun getKth(node: ListNode?, k :Int, n :Int = 0) :ListNode? = if ( n == k ) node else getKth(node?.next, k, n + 1)
        fun getSize(node: ListNode?, n :Int = 0) :Int = if ( node == null ) n else getSize(node?.next, n + 1)
        return getKth(head, getSize(head)!! / 2)!!
    }
}