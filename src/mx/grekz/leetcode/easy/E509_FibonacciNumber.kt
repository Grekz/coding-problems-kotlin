package mx.grekz.leetcode.easy

/**
 * @author grekz
 */
class E509_FibonacciNumber {
    fun fib(N: Int): Int = if ( N < 2 ) N else fib(N-1) + fib(N-2)
}