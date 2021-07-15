/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2) {
            return s;
        }
        int len = s.length();
        boolean[][] flag = new boolean[len][len];
        for(int i=0;i<len;i++){
            flag[i][i]=true;
        }
        int maxLen = 1, begin = 0;
        int left = 0;
        
        for(int L=2; L <= s.length(); L ++) {
            for( left = 0; left <= s.length()-L; left ++) {
                int right = left + L -1;
                if(right>=len) {
                    break;
                }

                if(s.charAt(left) != s.charAt(right)) {
                    flag[left][right] = false;
                } else if(right-left<3) {
                    flag[left][right] = true;
                } else {
                    flag[left][right] = flag[left+1][right-1];
                }
                
                if(flag[left][right] && L > maxLen) {
                    maxLen = L;
                    begin = left;
                } 
            }
        }
        return s.substring(begin,begin+maxLen);

    }
}
// @lc code=end

