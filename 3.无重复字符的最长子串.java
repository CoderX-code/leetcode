/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 * 思路：使用滑动窗口
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, left=0;//left为窗口开始的位置，maxLen为窗口最大值
        Map<Character,Integer> window = new HashMap<>(2);
        Integer index;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            index = window.get(c);
            if(index!=null && window.get(c)>=left){
                left = window.get(c)+1;
            }
            window.put(c,i);
            maxLen = i-left+1 > maxLen ? i-left+1 : maxLen;
        }
        return maxLen;
    }
}
// @lc code=end

