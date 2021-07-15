/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 * 解法一: 合并数组，找合并后的中位数，复杂度O（m+n）
 * 解法二: 二分查找，复杂度O(log(m+n))
 */

// @lc code=start
class Solution {
    // 解法二
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=0,r1=nums1.length;
        int l2=0,r2=nums2.length;

        
    }

    /* 解法一
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,mergeIndex=0,current;
        int m = nums1.length, n = nums2.length;
        int a1 = (m+n+1)/2, a2 = (m+n+2)/2;
        double temp = 0.0;
        while(mergeIndex< a2) {
            if(i<m && j<n) {
                if(nums1[i]<=nums2[j]) {
                    current = nums1[i];
                    i++;
                } else {
                    current = nums2[j];
                    j++;
                }
            } else if(i<m) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
            
            mergeIndex ++;
            if(mergeIndex == a1 || mergeIndex == a2) {
                temp = temp + current;
            }
        }
        return a1==a2 ? temp : temp/2;
    }
    */
}
// @lc code=end

