/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }

        int p=0; // 前值下标
        int len = nums.length;
        for(int i=1;i<len;i++) {
            if(nums[i]!=nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return p+1;
    }
}
// @lc code=end

