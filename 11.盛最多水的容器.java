/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length -1;
        int max = 0,area = 0,len=0;
        if(height.length == 2) {
            return Math.min(height[0],height[1]);
        }
        while(left<right) {
            len = right - left;
            if(height[left]<= height[right]) {
                area = height[left] * len;
                left++;
            } else {
                area = height[right] * len;
                right--;
            }
            max = Math.max(area,max);
        }
        return max;
    }
}
// @lc code=end

