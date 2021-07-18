import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length<3) {
            return result;
        }
        int len = nums.length;
        Arrays.sort(nums); // 排序
        for(int i=0;i<len-2;i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = (-1) * nums[i];
            int q = len-1;
            for(int p=i+1;p<len-1;p++) {
                if(p>i+1 && nums[p] == nums[p-1]) {
                    continue;
                }
                while (p<q) {
                    int current = nums[p]+nums[q];
                    if(current == target) {
                        addSolution(nums, result, i, p, q);
                        break;
                    } else if(current>target){
                        q--;
                    } else {
                        p++;
                    }
                }
            }
        }
        return result;
    }

    public void addSolution(int[] nums,List<List<Integer>> result, int a,int b, int c) {
        List<Integer> temp = new ArrayList(3);
        temp.add(nums[a]);
        temp.add(nums[b]);
        temp.add(nums[c]);


        result.add(temp);
    }
}
// @lc code=end

