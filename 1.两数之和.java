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
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length;i++) {
            Integer j = map.get(target-nums[i]);
            if(j!=null && i!=j) {
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
        }
        return result;
    }
}
// @lc code=end

