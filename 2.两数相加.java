/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t=0; //进位标记
        ListNode p=l1;
        ListNode q=l2; // 两个链表的当前节点指针
        ListNode result= new ListNode(0);
        ListNode current = result;
        int a1=0,a2=0; // 两个指针的val值
        while(p!=null || q!=null || t >0){
            current.next = new ListNode(0);
            current = current.next;
            if(p!=null) {
                a1 = p.val;
                p = p.next;
            } else {
                a1 = 0;
            }
            if(q!=null) {
                a2 = q.val;
                q = q.next;
            } else {
                a2 = 0;
            }
            int temp = a1 + a2 + t;
            current.val = temp % 10;
            t = temp / 10;
        }
        return result.next;
    }
}
// @lc code=end

