/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i=0; i<nums.length;i++) {
            Integer j = map.get(target-nums[i]);
            if(j!=null && i!=j) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
// @lc code=end

