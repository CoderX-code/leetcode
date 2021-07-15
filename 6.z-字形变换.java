import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        int flag = 1; // 方向
        int current=0; // 当前行的指针
        int len = s.length();
        List<StringBuilder> sbList = new ArrayList<>(numRows); // 每行的字符串
        if(numRows < 2) {
            return s;
        }
        for(int i=0;i<numRows && i<len;i++) {
            sbList.add(new StringBuilder());
        }
    
        for(char c : s.toCharArray()) {
            StringBuilder sb = sbList.get(current);
            sb.append(c);
            current = current + flag;
            if(current == 0 || current == numRows-1) {
                flag = flag * (-1);
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i< sbList.size(); i ++) {
            result.append(sbList.get(i).toString());
        }
        return result.toString();
    }
}
// @lc code=end

