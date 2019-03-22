package mx.grekz.leetcode.hard

/**
 * @author grekz
 */
class E0042_TrappingRainWater {
    fun trap(height: IntArray): Int {
        var l = 0
        var r = height.size - 1
        var ml = 0
        var mr = 0
        var res = 0
        while ( l < r ) {
            if ( height[r] > height[l] ) {
                if ( ml < height[l] ) {
                    ml = height[l]
                }else{
                    res += ml - height[l]
                }
                l++
            }else{
                if ( mr < height[r] ) {
                    mr = height[r]
                }else{
                    res += mr - height[r]
                }
                r--
            }
        }
        return res
    }
}